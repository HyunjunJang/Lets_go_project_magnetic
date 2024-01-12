package com.magneti.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcUtil {
	
	
	public static final String url = "jdbc:oracle:thin:@172.30.1.20:1521:xe";
	public static final String uid = "magnetic2";
	public static final String upw = "1234";
	
	
	public static void close(Connection conn,
						     PreparedStatement pstmt,
						     ResultSet rs) {
		try {

			if(conn != null) conn.close();
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();
				
		} catch (Exception e) {
			System.out.println("===========close에러===========");
		}
		
	}
	
	
}
