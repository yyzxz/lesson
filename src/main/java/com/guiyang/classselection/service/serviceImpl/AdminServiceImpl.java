package com.guiyang.classselection.service.serviceImpl;

import com.guiyang.classselection.mapper.SystemMapper;
import com.guiyang.classselection.pojo.dto.User;
import com.guiyang.classselection.pojo.vo.ReplyVO;
import com.guiyang.classselection.service.AdminService;
import com.guiyang.classselection.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: com.guiyang.classselection.service
 *
 * @author zhangya
 * @Description: ${todo}
 * @date 2019-10-15
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    SystemMapper mapper;

    @Override
    public ReplyVO list(User user) {
        return new ReplyVO(mapper.list(user.getRole()));
    }

    @Override
    public ReplyVO add(User user) {
        if (mapper.addUser(user) > 0) {
            return new ReplyVO();
        }
        return new ReplyVO(1, "添加失败！");
    }

    @Override
    public ReplyVO userInfo(User user) {
        return new ReplyVO(mapper.userInfo(user.getId()));
    }

    @Override
    public ReplyVO update(User user) {
        if (mapper.updateUser(user) > 0) {
            return new ReplyVO();
        }
        return new ReplyVO(1, "更新失败！");
    }

    @Override
    public ReplyVO del(User user) {
        if (mapper.delUser(user.getId()) > 0) {
            return new ReplyVO();
        }
        return new ReplyVO(1, "删除失败！");
    }
// TODO: 2019-10-17 下载功能

    @Override
    public void downloadMaterial(String path) {

    }
}
