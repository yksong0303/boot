
package com.boot.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.boot.vo.UserInfoVO;

public interface UserService {
	int insertUser(UserInfoVO user);
	int deleteUser(UserInfoVO user);
	int updateUser(UserInfoVO user);
	UserInfoVO selectUser(UserInfoVO user);
	boolean checkUserId(String uiId);
	boolean doLogin(UserInfoVO user,HttpSession hs);
	List<UserInfoVO> selectUserList(UserInfoVO user);
}
