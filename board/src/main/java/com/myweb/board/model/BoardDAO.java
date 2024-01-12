package com.myweb.board.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.myweb.util.JdbcUtil;


public class BoardDAO {
	
	//싱글톤
	//1. 객체 1개 생성
	private static BoardDAO instance = new BoardDAO();
	//2. 생성자 private
	private BoardDAO() {
		
		try {
			//드라이버 호출문장
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//초기설정 값을 얻을 수 있는 객체
			InitialContext init = new InitialContext();
			dataSource = (DataSource)init.lookup("java:comp/env/jdbc/oracle");
			
			
		} catch (Exception e) {
		}
		
	}
	//3. getter메서드
	public static BoardDAO getInstance() {
		return instance;
	}
	
	/////////////////////////////////////////////
	//private String url = JdbcUtil.url;
	//private String uid = JdbcUtil.uid;
	//private String upw = JdbcUtil.upw;
	
	//커넥션풀에서 얻어온 디비객체 정보.
	private DataSource dataSource;
	
	//글등록
	public void insert(String member_id, String entty_type, String bd_title, String bd_contents) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "insert into totalboard(board_id, member_id, entty_type, bd_title, bd_contents, bd_date, bd_update, bd_cnt)" 
				   + "values(board_id_seq.nextval, ?, ?, ?, ?, sysdate, sysdate, 0 )";
		
		try {
			
			conn = dataSource.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, member_id );
			pstmt.setString(2, entty_type );
			pstmt.setString(3, bd_title );
			pstmt.setString(4, bd_contents );
			
			pstmt.executeUpdate();
						
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, null);
		}
		
		
	}
	
	//목록조회
	public ArrayList<BoardVO> getList() {
		
		ArrayList<BoardVO> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from totalboard order by board_id desc";
		
		try {
			
			conn = dataSource.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				int board_id = rs.getInt("board_id");
				String member_id = rs.getString("member_id");
				String entty_type = rs.getString("entty_type");
				String bd_title = rs.getString("bd_title");
				String bd_contents = rs.getString("bd_contents");
				Timestamp bd_date = rs.getTimestamp("bd_date");
				Timestamp bd_update = rs.getTimestamp("bd_update");
				int bd_cnt = rs.getInt("bd_cnt");
				
				BoardVO vo = new BoardVO(board_id, member_id, entty_type, bd_title, bd_contents, bd_date, bd_update, bd_cnt);
						
								
				list.add(vo);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
		}

		return list;
	}
	
	//내용조회
	public BoardVO getContent(String board_id) {
		
		BoardVO vo = new BoardVO(); //
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from totalboard where board_id = ?";
		
		try {
			
			conn = dataSource.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board_id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				int board_id2 =  rs.getInt("board_id");
				String member_id = rs.getString("member_id");
				String entty_type = rs.getString("entty_type");
				String bd_title = rs.getString("bd_title");
				String bd_contents = rs.getString("bd_contents");
				Timestamp bd_date = rs.getTimestamp("bd_date");
				Timestamp bd_update = rs.getTimestamp("bd_update");
				int bd_cnt = rs.getInt("bd_cnt") + 1;
				
				vo.setBoard_id(board_id2);
				vo.setMember_id(member_id);
				vo.setEntty_type(entty_type);
				vo.setBd_title(bd_title);
				vo.setBd_contents(bd_contents);
				vo.setBd_date(bd_date);
				vo.setBd_update(bd_update);
				vo.setBd_cnt(bd_cnt);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
		}

		return vo;
	}
	
	//글 수정
	public int update(String board_id, String bd_title, String bd_contents) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "update totalboard set bd_title = ?, bd_contents = ?, bd_date = sysdate where board_id = ?";
		
		try {
			conn = dataSource.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bd_title );
			pstmt.setString(2, bd_contents );
			pstmt.setString(3, board_id );
			
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, null);
		}
		
		return result;
	}
	
	//조회수 업데이트
//	public BoardVO cntdate(String board_id, int bd_cnt) {
//		BoardVO vo = new BoardVO();
//		
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		
//		String sql = "update totalboard set bd_cnt = ? where board_id = ?";
//		try {
//			conn = dataSource.getConnection();
//			
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, bd_cnt);
//			pstmt.setString(2, board_id);
//			
//			
//			result = pstmt.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			JdbcUtil.close(conn, pstmt, null);
//		}
//		return vo;
//	}
	
	
	
}
