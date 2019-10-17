package com.guiyang.classselection.service;

import com.guiyang.classselection.pojo.vo.ReplyVO;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * ClassName: com.guiyang.classselection.service
 *
 * @author zhangya
 * @Description: 通用sevice interface
 * @date 2019-10-15
 */
public interface TeacherService {
    ReplyVO upload(MultipartFile file, int type);

    // 负责的课程，显示课程上传资料的审核状态
    ReplyVO listSelfCourse(int teacherId);

    //    每个课程及对应的课程计划
    ReplyVO listCoursePlan(int courseId);

    //    完成课程
    ReplyVO updateLessonFin(int lessonId);

    //    课次作业批改情况
    ReplyVO listLessonHomeworkInfo(int courseId);

    //    上传课次作业
    ReplyVO uploadHomework(int lessonId);

    //    查看选此门课的学生
    ReplyVO listStudent(int teacherId);

    //    上传学生课次成绩 （判断课次作业评估是否完成）
    ReplyVO uploadHomeworkFin(int lessonId, int studentId, float score);

    //    查看学生课次作业成绩
    ReplyVO listStudentHomeInfo(int courseId, int studentId);

    //    课次资源列表
    ReplyVO listMaterial(int courseId);

    ReplyVO listStuResult(int teacherId);

}
