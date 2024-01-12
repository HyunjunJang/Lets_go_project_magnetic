package com.magneti.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.magneti.util.JdbcUtil;

public class MagDAO {
	
	public static MagDAO instance = new MagDAO();

	public MagDAO() {
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		} catch (Exception e) {
		}
		
	}
	public static MagDAO getInstance() {
		return instance;
		
	}
	
	private String url = JdbcUtil.url;
	private String uid = JdbcUtil.uid;
	private String upw = JdbcUtil.upw;
	
	public int idCheck(String member_id) {
		int result = 0;
	
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from member where member_id = ?";
		
		try {
			
			conn = DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member_id);
			
			rs = pstmt.executeQuery();
			
			if( rs.next() ) { 
				result = 1; 
			} else { 
				result = 0; 
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
		return result;
	}
			
	public void insertUser(MagVO vo) {
	    
		Connection conn = null;
	    PreparedStatement pstmt = null;

	    String sql = "insert into member(member_id, pw, name, nick, age, gender, type)" 
	                 + "values(?, ?, ?, ?, ?, ?, ?)";

	    try {
	        conn = DriverManager.getConnection(url, uid, upw);
	        pstmt = conn.prepareStatement(sql);

	        pstmt.setString(1, vo.getMember_id());
	        pstmt.setString(2, vo.getPw());
	        pstmt.setString(3, vo.getName());
	        pstmt.setString(4, vo.getNick());
	        pstmt.setString(5, vo.getAge());
	        pstmt.setString(6, vo.getGender());
	        pstmt.setString(7, vo.getType());

	        pstmt.executeUpdate();
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        JdbcUtil.close(conn, pstmt, null);
	    }
	}
	
	public MagVO login(String member_id, String pw) {
		
		MagVO vo = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from member where member_id = ? and pw = ?";
		
		try {
			
			conn = DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member_id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) { 
				
				vo = new MagVO();
				vo.setMember_id(member_id);
				vo.setName( rs.getString("name") );
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
	
		return vo;
	}
	
	public MagVO getUserInfo(String member_id) {
		
		MagVO vo = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from member where member_id = ?";
		
		try {
			
			conn = DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member_id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) { 
				
				String name = rs.getString("name");
				String nick = rs.getString("nick");
				String age = rs.getString("age");
				String gender =rs.getString("gender");
				String type =rs.getString("type");
				
				vo = new MagVO(member_id, null, name, nick, age, gender, type);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
		}

		return vo;
	}
	
	public int update(MagVO vo) {
		
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "update member set pw = ?, name = ?, nick = ?, age = ?, gender = ?, type = ? where member_id = ?";
		
		try {
			
			conn = DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getPw() );
			pstmt.setString(2, vo.getName() );
			pstmt.setString(3, vo.getNick() );
			pstmt.setString(4, vo.getAge() );
			pstmt.setString(5, vo.getGender() );
			pstmt.setString(6, vo.getType() );
			pstmt.setString(7, vo.getMember_id() );
			
			result = pstmt.executeUpdate(); 
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, null);
		}
		
		
		
		return result;
	}
	
	public void delete(String member_id) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "delete from member where member_id = ?";
		
		try {
			
			conn = DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member_id);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, null);
		}
		
		
		
	}
	
	










}
	
