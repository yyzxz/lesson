package com.guiyang.classselection.service.serviceImpl;

import com.guiyang.classselection.mapper.SystemMapper;
import com.guiyang.classselection.pojo.dto.Course;
import com.guiyang.classselection.pojo.dto.Lesson;
import com.guiyang.classselection.pojo.dto.Material;
import com.guiyang.classselection.pojo.vo.ReplyVO;
import com.guiyang.classselection.service.EduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * ClassName: com.guiyang.classselection.service
 *
 * @author zhangya
 * @Description: ${todo}
 * @date 2019-10-15
 */
@Service
public class EduServiceImpl implements EduService {
    @Autowired
    SystemMapper mapper;

    @Override
    public ReplyVO addCourse(Course course) {
        if (mapper.addCourse(course) > 0) {
            return new ReplyVO();
        }
        return new ReplyVO(1, "添加失败！");
    }

    @Override
    public ReplyVO listCourse() {
        List<Map> list = mapper.listCourse();
        for (Map item : list) {
            int courseId = (int) item.get("course_id");
            Map progress = mapper.courseProgress(courseId);
            item.put("finish_num", progress.get("finish"));
            item.put("all_num", progress.get("all_num"));
        }
        return new ReplyVO(list);
    }

    @Override
    public ReplyVO listLesson(Course course) {
        return new ReplyVO(mapper.listLesson(course.getId()));
    }

    @Override
    public ReplyVO addCoursePlan(Lesson lesson) {
//      验证是否该课程是否已经存在该课次
        int exist = mapper.coursePlanNameRepeat(lesson.getCourse_id(), lesson.getName());
        if (exist > 0) {
            return new ReplyVO(1, "该课次已存在！");
        }
        lesson.setLesson_order(System.currentTimeMillis());
        if (mapper.addCoursePlan(lesson) > 0) {
            return new ReplyVO();
        }
        return new ReplyVO(1, "添加失败！");
    }

    @Override
    public ReplyVO homeworkFinInfo(Course course) {
        //        flg=2,homework
        return new ReplyVO(mapper.evaluInfo(course.getId(), 2));
    }

    @Override
    public ReplyVO attendanceInfo(Course course) {
        //        flg=1,attendance
        return new ReplyVO(mapper.evaluInfo(course.getId(), 1));
    }

    @Override
    public ReplyVO updateAttendance(Lesson lesson) {
        int attendance = mapper.lessonEvalu(lesson.getId(), 1);
//        有"未出勤"记录，但是需更新为出勤，则删除记录
        if (attendance > 0 && lesson.getAttendance() == 1) {
            if (mapper.delEvalu(lesson.getId(), 1) > 0) {
                return new ReplyVO();
            }
            return new ReplyVO(1, "更新失败！");
        }
//        无记录，但是要记缺勤，则新增记录
        if (attendance == 0 && lesson.getAttendance() == 0) {
            if (mapper.addLessonEval(lesson.getId(), 1) > 0) {
                return new ReplyVO();
            }
            return new ReplyVO(1, "更新失败！");
        }
        return new ReplyVO();
    }

    @Override
    public ReplyVO listCourseMaterial() {
        return new ReplyVO(mapper.listCourseMaterial());
    }

    @Override
    public ReplyVO verifyCourseMaterial(Material material) {
        if (mapper.verifyCourseMaterial(material.getCourse_id(),
                material.getState()) > 0) {
            return new ReplyVO();
        }
        return new ReplyVO(1, "操作失败！");
    }

    @Override
    public ReplyVO studentResult() {
        return new ReplyVO(mapper.studentResult());
    }

}
