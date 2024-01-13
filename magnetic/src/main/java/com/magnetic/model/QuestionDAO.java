package com.magnetic.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.magnetic.util.JdbcUtil;

public class QuestionDAO {
	
	private static QuestionDAO instance =new QuestionDAO();
	
	
	private QuestionDAO() {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		}catch(Exception e) {
			
		}
	}
	
	public static QuestionDAO getInstance() {
		return instance;
	}
	
	//
	
	private String url = JdbcUtil.url;
	private String uid = JdbcUtil.uid;
	private String upw = JdbcUtil.upw;
	
	public int idCheck(String member_id) { // 테스트 한적 있는지 여부 확인
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from answer where member_id = ?";
		
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member_id);
			
			rs = pstmt.executeQuery();
			
			if( rs.next() ) {
				result = 1;
			}else {
				result = 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
		return result;
	}
	
	public void insertAnswer(QuestionVO vo) { // 클릭한 답을 -> 데이터베이스
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			String sql = "insert into answers(answer_id, member_id, q1, q2, q3, q4, q5, q6)"
					+ "values(answer_seq.nextval, ?, ?, ?, ?, ?, ?, ? )";
			try {
				conn = DriverManager.getConnection(url, uid, upw);
				
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, vo.getAnswer_id());
				pstmt.setString(2, vo.getMember_id());
				pstmt.setString(3, vo.getQ1());
				pstmt.setString(4, vo.getQ2());
				pstmt.setString(5, vo.getQ3());
				pstmt.setString(6, vo.getQ4());
				pstmt.setString(7, vo.getQ5());
				pstmt.setString(8, vo.getQ6());
	
				
				pstmt.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, pstmt, null);
			
		}
		
		}
	
	public QuestionVO getQuestionInfo(String member_id) { // 테스트 답 조회
		
		QuestionVO vo = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from answer where member_id = ?";
		
		try {
			
			conn = DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member_id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next() ) {
				
				String answer_sid = rs.getString("answer_id");
				String q1 = rs.getString("q1");
				String q2 = rs.getString("q2");
				String q3 = rs.getString("q3");
				String q4 = rs.getString("q4");
				String q5 = rs.getString("q5");
				String q6 = rs.getString("q6");
			
				
					int answer_id = (Integer.parseInt(answer_sid));
					
				vo = new QuestionVO(answer_id, member_id , q1, q2, q3, q4, q5, q6);
			
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
		return vo;
	}
	
	public int update(QuestionVO vo) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "update answers set q1 = ?, q2 = ?, q3 = ?, q4 = ?, q5 = ?, q6 = ? where member_id =?";
		
		try {
			
			conn = DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getQ1());
			pstmt.setString(2, vo.getQ2());
			pstmt.setString(3, vo.getQ3());
			pstmt.setString(4, vo.getQ4());
			pstmt.setString(5, vo.getQ5());
			pstmt.setString(6, vo.getQ6());
			
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, pstmt, null);
		}
		return result;
	}
}
