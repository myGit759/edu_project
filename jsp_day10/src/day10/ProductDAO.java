package day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductDAO {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	private final String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private final String user = "c##itbank";
	private final String password = "it";
	
	public ProductDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		}catch(SQLException e) {
			System.out.println("DAO 생성자 예외 발생 : " + e);
		}catch(ClassNotFoundException e) {
			System.out.println("지정한 클래스를 찾을 수 없습니다 : " + e);
		}
	}
	public ArrayList<ProductDTO> selectList(){
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		String sql = "select * from product";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				ProductDTO ob = new ProductDTO();
				ob.setIdx(rs.getInt("idx"));
				ob.setName(rs.getString("name"));
				ob.setPrice(rs.getInt("price"));
				ob.setImgPath(rs.getString("imgPath"));
				list.add(ob);
			}
			
		}catch(SQLException e) {
			System.out.println("selectList에서 예외 발생 : " + e);
		}finally {
			try { if(rs != null) rs.close();}	catch(Exception e) {}
			try { if(stmt != null) stmt.close();}	catch(Exception e) {}
			try { if(conn != null) conn.close();}	catch(Exception e) {}
		}
		return list;
	}
	
	public ArrayList<ProductDTO> selectListByName(String keyword){
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		String sql = "select * from product where name like '%" + keyword + "%'";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				ProductDTO ob = new ProductDTO();
				ob.setIdx(rs.getInt("idx"));
				ob.setName(rs.getString("name"));
				ob.setPrice(rs.getInt("price"));
				ob.setImgPath(rs.getString("imgPath"));
				list.add(ob);
			}
			
		}catch(SQLException e) {
			System.out.println("selectList에서 예외 발생 : " + e);
		}finally {
			try { 
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {}
		}
		return list;
	}

	public ProductDTO selectOne(int idx){
		ProductDTO ob = null;
		String sql = "select * from product where idx = " + idx ;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				ob = new ProductDTO();
				ob.setIdx(rs.getInt("idx"));
				ob.setName(rs.getString("name"));
				ob.setPrice(rs.getInt("price"));
				ob.setImgPath(rs.getString("imgPath"));
			}
			
		}catch(SQLException e) {
			System.out.println("selectList에서 예외 발생 : " + e);
		}finally {
			try { 
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {}
		}
		return ob;
	}
}
