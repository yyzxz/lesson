package com.guiyang.classselection.service;

import com.guiyang.classselection.pojo.dto.User;
import com.guiyang.classselection.pojo.vo.ReplyVO;

/**
 * ClassName: com.guiyang.classselection.service
 *
 * @author zhangya
 * @Description: 通用sevice interface
 * @date 2019-10-15
 */
public interface AdminService {

    ReplyVO list(User user);
    ReplyVO add(User user);

    ReplyVO userInfo(User user);

    ReplyVO update(User user);

    ReplyVO del(User user);
    void downloadMaterial(String path);

}
