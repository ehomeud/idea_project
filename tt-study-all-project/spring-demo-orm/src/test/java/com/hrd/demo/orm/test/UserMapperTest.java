package com.hrd.demo.orm.test;


import com.hrd.demo.mapper.UserMapper;
import com.hrd.demo.model.User;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.misc.CharacterEncoder;
import sun.nio.cs.ext.DoubleByte;

import java.nio.charset.CharsetEncoder;
import java.util.List;

/**
 * @Description: AUTO
 * @ClassName: UserMapperTest.java
 * @Package: com.hrd.demo.orm.test
 * @Author: hurd@hundsun.com
 * @Date: 2015年08月05日 16:07:16:07
 * @ ClassFullName: com.hrd.demo.orm.test.UserMapperTest.java
 * @ Copyright: 版权归 Hundsun 所有
 * <ModifyLog>
 * @ ModifyContent:
 * @ Author:
 * @ Date:
 * </ModifyLog>
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-test.xml")
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert(){
        User user = new User();
        user.setUserCode("ehomeud");
        user.setUserName("ehomeud");
        user.setAge(20);
        user.setEmail("fengcaihrd_1@163.com");
        user.setPasswd("000000");
        userMapper.insert(user);
    }
    @Test
    public void findList(){
       List<User> list =  userMapper.findEntiesByParam(new User());
        System.out.println(list);
    }
}
