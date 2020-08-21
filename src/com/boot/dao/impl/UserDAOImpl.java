package com.boot.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.jsp.jstl.sql.Result;

import com.boot.dao.UserDAO;
import com.boot.servlet.InitServlet;
import com.boot.vo.UserInfoVO;

public class UserDAOImpl implements UserDAO {

	@Override
	public int insertUser(UserInfoVO user) {
		String sql = "insert into user_info(\r\n" + 
				"ui_name,ui_num, ui_age, ui_birth,\r\n" + 
				"ui_id, ui_password,ui_phone,ui_email,\r\n" + 
				"ui_credat,ui_nickname)\r\n" + 
				"values(\r\n" + 
				"?,seq_ui_num.nextval, ?, ?,\r\n" + 
				"?,?,?,?,\r\n" + 
				"sysdate,?)";
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = InitServlet.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUiName());
			ps.setInt(2,user.getUiAge());
			ps.setString(3, user.getUiBirth());
			ps.setString(4, user.getUiId());
			ps.setString(5,user.getUiPassword());
			ps.setString(6,user.getUiPhone());
			ps.setString(7, user.getUiEmail());
			ps.setString(8, user.getUiNickname());
			int cnt =  ps.executeUpdate();
			con.commit();
			return cnt;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			InitServlet.close(ps, con);
		}
		return 0;
	}

	@Override
	public int deleteUser(UserInfoVO user) {
		String sql = "delete from user_info where ui_num=?";
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = InitServlet.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, user.getUiNum());
			int cnt = ps.executeUpdate();
			con.commit();
			return cnt;
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			InitServlet.close(ps, con);
		}
		return 0;
	}
	@Override
	public int updateUser(UserInfoVO user) {
		String sql = "update user_info\r\n" + 
				"set ui_name=?,\r\n" + 
				"ui_age = ?,\r\n" + 
				"ui_birth = ?,\r\n" + 
				"ui_password = ?,\r\n" + 
				"ui_phone = ?,\r\n" + 
				"ui_email = ?,\r\n" + 
				"UI_NICKNAME = ?\r\n" + 
				"where ui_num=?";
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = InitServlet.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUiName());
			ps.setInt(2, user.getUiAge());
			ps.setString(3, user.getUiBirth());
			ps.setString(4, user.getUiPassword());
			ps.setString(5, user.getUiPhone());
			ps.setString(6, user.getUiEmail());
			ps.setString(7, user.getUiNickname());
			ps.setInt(8, user.getUiNum());
			int cnt = ps.executeUpdate();
			con.commit();
			return cnt;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			InitServlet.close(ps, con);
		}
		
		return 0;
	}

	@Override
	public UserInfoVO selectUser(UserInfoVO user) {
		String sql = "select ui_num,ui_name,ui_num, ui_age, ui_birth,\r\n" + 
				"ui_id, ui_password,ui_phone,ui_email,\r\n" + 
				"ui_credat,ui_nickname,ui_credat, ui_admin from user_info where ui_num=?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = InitServlet.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, user.getUiNum());
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
				ui.setUiAdmin(rs.getString("ui_admin"));
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
	public List<UserInfoVO> selectUserList(UserInfoVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfoVO selectUserForLogin(UserInfoVO user) {
		String sql = "select ui_num,ui_name,ui_num, ui_age, ui_birth,\r\n" + 
				"ui_id, ui_password,ui_phone,ui_email,\r\n" + 
				"ui_credat,ui_nickname,ui_credat,ui_admin from user_info where ui_id=? and ui_password=?";
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
				ui.setUiPassword(rs.getString("ui_password"));
				ui.setUiAdmin(rs.getString("ui_admin"));
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
