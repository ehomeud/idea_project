package com.hrd.demo.mvc.util;

import com.hrd.demo.model.User;

/**
 * @Description: 单例（简写后期修改） 用于存储线程安全的用户信息
 * @ClassName: UserSession.java
 * @Package: com.hrd.demo.mvc.util
 * @Author: hurd@hundsun.com
 * @Date: 2015年08月06日 10:07:10:07
 * @ClassFullName: com.hrd.demo.mvc.util.UserSession.java
 * @Copyright: 版权归 Hundsun 所有
 * <ModifyLog>
 * @ ModifyContent:
 * @ Author:
 * @ Date:
 * </ModifyLog>
 */
public class UserSession {
    private UserSession() {
    }

    private ThreadLocal<User> userThd = new ThreadLocal<>();
    private ThreadLocal<String> nameThd = new ThreadLocal<>();

    private static UserSession session = new UserSession();

    public static UserSession getInstance() {
        return session;
    }

    public String getUserName() {
        return nameThd.get();
    }

    public void setUserName(String userName) {
        nameThd.set(userName);
    }


    public User getUser() {
        return userThd.get();
    }

    public void setUser(User user) {
        userThd.set(user);
    }
}
