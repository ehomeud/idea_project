package com.hrd.demo.mvc.controller;


import com.hrd.demo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/auth")
public class LoginController {


    protected static Logger logger = LoggerFactory.getLogger(LoginController.class);

    /**
     * 指向登录页面
     */
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String getLoginPage(@RequestParam(value = "error", required = false) boolean error, ModelMap model,User user) {

        logger.debug("Received request to show login page");
        logger.info(user.toString()+"aaa");
        if (error) {
            // Assign an error message
            model.put("error",
                    "You have entered an invalid username or password!");
        } else {
            model.put("error", "");
        }
        return "login";

    }

    /**
     * 指定无访问额权限页面
     *
     * @return 拒绝
     */
    @RequestMapping(value = "/denied", method = RequestMethod.GET)
    public String getDeniedPage() {

        logger.debug("Received request to show denied page");

        return "denied";
    }
}
