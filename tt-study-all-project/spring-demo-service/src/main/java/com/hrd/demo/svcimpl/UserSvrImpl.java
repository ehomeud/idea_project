package com.hrd.demo.svcimpl;

import com.hrd.demo.mapper.UserMapper;
import com.hrd.demo.model.User;
import com.hrd.demo.svc.UserSvr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: AUTO
 * @ClassName: UserSvrImpl.java
 * @Package: com.hrd.demo.svcimpl
 * @Author: hurd@hundsun.com
 * @Date: 2015年08月05日 19:03:19:03
 * @ClassFullName: com.hrd.demo.svcimpl.UserSvrImpl.java
 * @Copyright: 版权归 Hundsun 所有
 * <ModifyLog>
 * @ ModifyContent:
 * @ Author:
 * @ Date:
 * </ModifyLog>
 */
@Service("userSvrImpl")
public class UserSvrImpl implements UserSvr {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
       return userMapper.findEntiesByParam(new User());
    }
}
