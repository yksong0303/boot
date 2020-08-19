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
	public int insertUser(UserInfoVO user) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteUser(UserInfoVO user) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateUser(UserInfoVO user) {
		// TODO Auto-generated method stub
		return 0;
	}

	public UserInfoVO selectUser(UserInfoVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserInfoVO> selectUserList(UserInfoVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean doLogin(UserInfoVO user, HttpSession hs) {
		user = udao.selectUserForLogin(user);
		if(user!=null) {
			hs.setAttribute("user",user);
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		InitServlet is = new InitServlet();
		is.init();
		UserService usSer = new UserServiceImpl();
		UserInfoVO user = new UserInfoVO();
		user.setUi_id("test");
		user.setUi_password("test");
		boolean isLogin = usSer.doLogin(user,null);
		System.out.println(isLogin);
	}


}
