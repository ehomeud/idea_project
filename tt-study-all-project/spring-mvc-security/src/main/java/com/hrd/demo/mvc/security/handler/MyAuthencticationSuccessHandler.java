package com.hrd.demo.mvc.security.handler;

import com.hrd.demo.mvc.util.UserSession;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: 认证成功后，跳转到default-target-url 之前进行的一些处理
 * @ClassName: MyAuthencticationSuccessHandler.java
 * @Package: com.hrd.demo.mvc.security.handler
 * @Author: hurd@hundsun.com
 * @Date: 2015年08月06日 10:04:10:04
 * @ClassFullName: com.hrd.demo.mvc.security.handler.MyAuthencticationSuccessHandler.java
 * @Copyright: 版权归 Hundsun 所有
 * <ModifyLog>
 * @ ModifyContent:
 * @ Author:
 * @ Date:
 * </ModifyLog>
 */
@Service("myAuthencticationSuccessHandler")
public class MyAuthencticationSuccessHandler implements AuthenticationSuccessHandler {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MyAuthencticationSuccessHandler.class);

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        User secUser = (User) authentication.getPrincipal();
        com.hrd.demo.model.User user = new com.hrd.demo.model.User();
        user.setUserName(secUser.getUsername());
        user.setPasswd(secUser.getPassword());
        UserSession.getInstance().setUserName(secUser.getUsername());
        UserSession.getInstance().setUser(user);
        logger.info("##########" + secUser.toString());
    }
}
