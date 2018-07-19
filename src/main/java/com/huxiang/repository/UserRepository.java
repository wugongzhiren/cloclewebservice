package com.huxiang.repository;

import com.huxiang.bean.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by Administrator on 2017/2/16.
 */
public interface UserRepository extends JpaRepository<UserInfo,Long> {
    UserInfo findByPhoneAndPassword(@Param("mobilePhoneNumber") String mobilePhoneNumber,@Param("password") String password);
    UserInfo findByPhone(@Param("mobilePhoneNumber") String mobilePhoneNumber);
}
