package com.guiyang.classselection.mapper;

import com.guiyang.classselection.pojo.dto.Course;
import com.guiyang.classselection.pojo.dto.Lesson;
import com.guiyang.classselection.pojo.dto.Material;
import com.guiyang.classselection.pojo.dto.User;
import com.guiyang.classselection.pojo.vo.ReplyVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * ClassName: com.guiyang.classselection.mapper
 *
 * @author zhangya
 * @Description: ${todo}
 * @date 2019-10-16
 */
public interface SystemMapper {
    /**
     * admin
     */
    List<Map> list(int role);

    int addUser(@Param("usr") User user);

    int updateUser(@Param("usr") User user);

    int delUser(int id);

    Map userInfo(int id);

    /**
     * edu
     */

    int addCourse(@Param("item") Course course);

    List listCourse();

    Map courseProgress(int courseId);

    List listLesson(@Param("id") int courseId);

    int coursePlanNameRepeat(int courseId, String name);

    int addCoursePlan(@Param("item") Lesson lesson);

    List evaluInfo(int courseId, int evaluFlg);

    int lessonEvalu(int lessonId, int evaluFlg);

    int addLessonEval(int lessonId, int evaluFlg);

    int delEvalu(int lessonId, int evaluFlg);

    List listCourseMaterial();

    int verifyCourseMaterial(int courseId, int verify);

    List studentResult();

    /**
     * teacher
     */

    //    上传课程资源
    int saveCourseMat(Material item);

    //    上传课次资源
    int saveLessonMat(Material item);

    // 负责的课程，显示课程上传资料的审核状态
    List listSelfCourse(int teacherId);

    //    每个课程及对应的课程计划
    List listCoursePlan(int courseId);

    //    完成课程
    int updateLessonFin(int lessonId);

    //    课次作业批改情况
    List listLessonHomeworkInfo(int courseId);

    //    上传课次作业
    int updateHomework(int lessonId, String desc);

    //    查看选课的学生
    List listStudent(int teacherId);

    //    上传学生课次成绩 （判断课次作业评估是否完成）
    int uploadHomeworkResult(int lessonId, int studentId, float score);

    //    学生是否已有成绩，有则删老插新，不判断是否完成所有人员的批改
    int isExistScore(int lessonId, int studentId);

    //    查询已完成和总数的关系
    Map finAndAll(int lessonId);

    //    完成课次所有课业的批改，评估表
    int lessonFinEvalu(int lessonId, int evaluflg);

    //    查看学生课次作业成绩
    List listStudentHomeInfo(int courseId, int studentId);

    //    课次资源列表
    List listMaterial(int courseId);

    //    选课学生的最终成绩
    List listStuResult(int teacherId);
}
