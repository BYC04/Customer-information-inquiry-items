package cn.wby.service;

import cn.wby.pojo.User;

/**
 * @author wby
 * Created by abc on 2019/6/13.
 */
public interface UserService extends BaseService<User> {

    User login(String username);
}
