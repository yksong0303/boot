package com.boot.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.boot.dao.UserDAO;
import com.boot.dao.impl.UserDAOImpl;
import com.boot.service.UserService;
import com.boot.servlet.InitServlet;
import com.boot.vo.UserInfoVO;

public class UserServiceImpl implements UserService {
private UserDAO udao = new UserDAOImpl();
	
	@Override
	public int insertUser(UserInfoVO user) {
		if(udao.selectUserById(user.getUiId())!=null) {
			return -1;
		}
		return udao.insertUser(user);
	}

	@Override
	public int deleteUser(UserInfoVO user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUser(UserInfoVO user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserInfoVO selectUser(UserInfoVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserInfoVO selectUserForLogin(UserInfoVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserInfoVO> selectUserList(UserInfoVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean doLogin(UserInfoVO user, HttpSession hs) {
		user = udao.selectUserForLogin(user);
		if(user!=null) {
			hs.setAttribute("user", user);
			return true;
		}
		return false;
	}
	@Override
	public boolean checkUserId(String uiId) {
		UserInfoVO user = udao.selectUserById(uiId);
		if(user==null) {
			return true;
		}
		return false;
	}

}
