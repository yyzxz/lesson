package com.guiyang.classselection.service.serviceImpl;

import com.guiyang.classselection.pojo.vo.ReplyVO;
import com.guiyang.classselection.service.TeacherService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * ClassName: com.guiyang.classselection.service
 *
 * @author zhangya
 * @Description: ${todo}
 * @date 2019-10-15
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    private static final String directory = "C:\\Users\\Administrator\\Downloads";

    @Override
    public ReplyVO upload(MultipartFile file ,int type) {
        try {
            byte[] bytes = file.getBytes();
            String fileName = file.getOriginalFilename();
            System.out.println(fileName);
            System.out.println("path:" + directory + File.separator + System.currentTimeMillis() + fileName);
            Path path = Paths.get(directory + File.separator + System.currentTimeMillis() + fileName);

            Files.write(path, bytes);
            System.out.println("success");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ReplyVO();
    }
//  mac update
    @Override
    public ReplyVO listSelfCourse(int teacherId) {
        return null;
    }

    @Override
    public ReplyVO listCoursePlan(int courseId) {
        return null;
    }

    @Override
    public ReplyVO updateLessonFin(int lessonId) {
        return null;
    }

    @Override
    public ReplyVO listLessonHomeworkInfo(int courseId) {
        return null;
    }

    @Override
    public ReplyVO uploadHomework(int lessonId) {
        return null;
    }

    @Override
    public ReplyVO listStudent(int teacherId) {
        return null;
    }

    @Override
    public ReplyVO uploadHomeworkFin(int lessonId, int studentId, float score) {
        return null;
    }

    @Override
    public ReplyVO listStudentHomeInfo(int courseId, int studentId) {
        return null;
    }

    @Override
    public ReplyVO listMaterial(int courseId) {
        return null;
    }

    @Override
    public ReplyVO listStuResult(int teacherId) {
        return null;
    }
}


