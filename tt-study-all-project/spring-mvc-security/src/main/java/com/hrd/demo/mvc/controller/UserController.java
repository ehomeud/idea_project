package com.hrd.demo.mvc.controller;

import com.hrd.demo.model.User;
import com.hrd.demo.svc.UserSvr;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description: 用户控制器
 * @ClassName: UserController.java
 * @Package: com.hrd.demo.mvc.controller
 * @Author: hurd@hundsun.com
 * @Date: 2015年08月06日 22:23:22:23
 * @ClassFullName: com.hrd.demo.mvc.controller.UserController.java
 * @Copyright: 版权归 Hundsun 所有
 * <ModifyLog>
 * @ ModifyContent:
 * @ Author:
 * @ Date:
 * </ModifyLog>
 */
@RequestMapping("/user")
@Controller
public class UserController {

    protected final static Logger logger= LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserSvr userSvr;

    @ResponseBody
    @RequestMapping("/all")
    public List<User> getAllUser(){
        List<User>  list = userSvr.findAllUser();
        logger.info("所有用户信息：{}", list);
        return list;
    }
}
