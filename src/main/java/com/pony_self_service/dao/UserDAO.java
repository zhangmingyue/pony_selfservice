package com.pony_self_service.dao;

import com.pony_self_service.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: qiaoyi
 * @edit:
 * @created:17/5/10
 */
public interface UserDAO {

    int insert(User user);

    List<User> getAll();

    User getUserByUserNameAndPassword(@Param("nickname") String nickname,
                                      @Param("password") String password);
}
