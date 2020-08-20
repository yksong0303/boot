package com.boot.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.boot.dao.UserDAO;
import com.boot.servlet.InitServlet;
import com.boot.vo.UserInfoVO;

public class UserDAOImpl implements UserDAO {

	public int insertUser(UserInfoVO user) {
		String sql = "insert into user_info\r\n" + 
				"(ui_name, ui_num, ui_age, ui_birth, ui_id, ui_password, ui_phone, ui_email, ui_credat, ui_nickname)\r\n" + 
				"values(?,seq_ui_num.nextval,?,?,?,?,?,?,sysdate,?)";
		Connection con = null;
		PreparedStatement ps = null; 
		
		try {
			con =InitServlet.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1,user.getUiName());
			ps.setInt(2, user.getUiAge());
			ps.setString(3,user.getUiBirth());
			ps.setString(4,user.getUiId());
			ps.setString(5,user.getUiPassword());
			ps.setString(6,user.getUiPhone());
			ps.setString(7,user.getUiEmail());
			ps.setString(8,user.getUiNickname());
			int cnt = ps.executeUpdate();
			con.commit();
			return cnt;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			InitServlet.close(ps, con);
		}
		return 0;
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

	@Override
	public List<UserInfoVO> selectUserList(UserInfoVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfoVO selectUserForLogin(UserInfoVO user) {
		String sql = "select * from user_info where ui_id=? and ui_password=?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = InitServlet.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUiId());
			ps.setString(2, user.getUiPassword());
			rs = ps.executeQuery();
			if (rs.next()) {
				UserInfoVO ui = new UserInfoVO();
				ui.setUiNum(rs.getInt("ui_num"));
				ui.setUiName(rs.getString("ui_name"));
				ui.setUiAge(rs.getInt("ui_age"));
				ui.setUiId(rs.getString("ui_id"));
				ui.setUiBirth(rs.getString("ui_birth"));
				ui.setUiPhone(rs.getString("ui_phone"));
				ui.setUiNickname(rs.getString("ui_nickname"));
				ui.setUiCredat(rs.getString("ui_credat"));
				ui.setUiEmail(rs.getString("ui_email"));
				return ui;
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			InitServlet.close(rs, ps, con);
		}
		return null;
	}

	@Override
	public UserInfoVO selectUserById(String uiId) {
		String sql = "select * from user_info where ui_id=?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = InitServlet.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, uiId);
			rs = ps.executeQuery();
			if (rs.next()) {
				UserInfoVO ui = new UserInfoVO();
				ui.setUiNum(rs.getInt("ui_num"));
				ui.setUiName(rs.getString("ui_name"));
				ui.setUiAge(rs.getInt("ui_age"));
				ui.setUiId(rs.getString("ui_id"));
				ui.setUiBirth(rs.getString("ui_birth"));
				ui.setUiPhone(rs.getString("ui_phone"));
				ui.setUiNickname(rs.getString("ui_nickname"));
				ui.setUiCredat(rs.getString("ui_credat"));
				ui.setUiEmail(rs.getString("ui_email"));
				return ui;
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			InitServlet.close(rs, ps, con);
		}
		return null;
	}

}
