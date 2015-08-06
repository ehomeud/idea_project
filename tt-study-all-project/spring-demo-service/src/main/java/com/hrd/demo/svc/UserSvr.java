package com.hrd.demo.svc;

import com.hrd.demo.model.User;

import java.util.List;

/**
 * @Description: AUTO
 * @ClassName: UserSvr.java
 * @Package: com.hrd.demo.svc
 * @Author: hurd@hundsun.com
 * @Date: 2015年08月05日 18:51:18:51
 * @ClassFullName: com.hrd.demo.svc.UserSvr.java
 * @Copyright: 版权归 Hundsun 所有
 * <ModifyLog>
 * @ ModifyContent:
 * @ Author:
 * @ Date:
 * </ModifyLog>
 */
public interface UserSvr {
    /**
     * 查找所有的用户
     * @return
     */
    List<User> findAllUser();
}
