package com.weixin.demo.service;

import com.weixin.demo.entity.User;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserService {
public boolean IsNew(@Param("open_id") String open_id);
public void InsertUser(@Param("open_id") String open_id,@Param("session_key") String session_key);
public int getUser_id(@Param("open_id") String open_id);
public boolean IsUser(@Param("open_id") String open_id);
public void UpdateSessionKey(@Param("open_id") String open_id,@Param("session_key") String session_key);
public List<User> findByOpenid(@Param("open_id") String open_id);

public void UpdateUserName(@Param("user_id") int user_id,@Param("user_name") String user_name);
public void UpdateMajor(@Param("user_id") int user_id,@Param("major") String major);
public void UpdateSex(@Param("user_id") int user_id,@Param("sex") String sex);
public void UpdateSdept(@Param("user_id") int user_id,@Param("sdept") String sdept);
public void UpdateMotto(@Param("user_id") int user_id,@Param("motto") String motto);
public void UpdateNote(@Param("user_id") int user_id,@Param("note") String note);
public void UpdateUserData(@Param("user_id") int user_id,@Param("user_name") String user_name,@Param("major") String major,@Param("sex") String sex,@Param("sdept") String sdept,@Param("motto") String motto,@Param("note") String note);
}
