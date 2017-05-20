package com.pony_self_service.service;

import com.pony_self_service.domain.User;

import java.util.List;

/**
 * @author: qiaoyi
 * @edit:
 * @created:17/5/9
 */
public interface PermissionService {

    int insert(User user);

    List<User> getAll();

    User getUserByUserNameAndPassword(String nickname, String password);
}
