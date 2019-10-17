package com.guiyang.classselection.service;

import com.guiyang.classselection.pojo.dto.Course;
import com.guiyang.classselection.pojo.dto.Lesson;
import com.guiyang.classselection.pojo.dto.Material;
import com.guiyang.classselection.pojo.vo.ReplyVO;

/**
 * ClassName: com.guiyang.classselection.service
 *
 * @author zhangya
 * @Description: 通用sevice interface
 * @date 2019-10-15
 */
public interface EduService {
    //    添加课程
    ReplyVO addCourse(Course course);

    //    课程列表
    ReplyVO listCourse();

    //    查看课程的课次明细
    ReplyVO listLesson(Course course);

    // 添加课程计划，单个添加
    ReplyVO addCoursePlan(Lesson lesson);

    // 作业批改完成情况，仅查看，后台统计，所有学生作业都打过分了就算批改完成
    ReplyVO homeworkFinInfo(Course course);

    //    出勤情况
    ReplyVO attendanceInfo(Course course);

    // 添加课次出勤,未出勤则添加，默认出勤
    ReplyVO updateAttendance(Lesson lesson);

    //教师上传资源列表
    ReplyVO listCourseMaterial();

    //审核教师上传资源
    ReplyVO verifyCourseMaterial(Material material);

    //学生成绩
    ReplyVO studentResult();

}
