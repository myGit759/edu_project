package restaurant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RestaurantDAO {
	
	private final String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private final String user = "c##itbank";
	private final String password = "it";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public RestaurantDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void close() {
		
		try {
			if(rs != null)		rs.close();
			if(pstmt != null)	pstmt.close();
			if(conn != null)	conn.close();
		} catch(Exception e) {}
	}

	public ArrayList<RestaurantDTO> selectList(){
		ArrayList<RestaurantDTO> list = new ArrayList<RestaurantDTO>();
		String sql = "select * from restaurant";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				RestaurantDTO dto = new RestaurantDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setCategory(rs.getString("category"));
				dto.setStorename(rs.getString("storename"));
				dto.setAddress(rs.getString("address"));
				dto.setStorenumber(rs.getString("storenumber"));
				dto.setParking(rs.getString("parking"));
				dto.setJoindate(rs.getDate("joindate"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return list;
	}
	
	public RestaurantDTO selectOne(int idx) {
		
		RestaurantDTO dto = null;
		String sql = "select * from restaurant where idx=" + idx;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dto = new RestaurantDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setCategory(rs.getString("category"));
				dto.setStorename(rs.getString("storename"));
				dto.setAddress(rs.getString("address"));
				dto.setStorenumber(rs.getString("storenumber"));
				dto.setParking(rs.getString("parking"));
				dto.setJoindate(rs.getDate("joindate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return dto;
	}

	public int insert(RestaurantDTO dto) {
		int row = 0;
		String sql = "insert into restaurant (category, storename, address, storenumber, parking) values( ?, ?, ?, ?, ? )";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,dto.getCategory());
			pstmt.setString(2, dto.getStorename());
			pstmt.setString(3, dto.getAddress());
			pstmt.setString(4, dto.getStorenumber());
			pstmt.setString(5, dto.getParking());
			
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return row;
	}
	
	public int delete(String[] values) {
		int row = 0;
		String items = "";
		for(String s : values) {
			if(s.equals(values[values.length-1])){
				items += "idx=" + s;
			}else {
				items += "idx=" + s + " or ";
			}
		}
		 
		String sql = "delete from restaurant where " + items;
		try {
			pstmt = conn.prepareStatement(sql);
			row = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return row;
	}
	
	public int update(RestaurantDTO dto) {
		int row = 0;
		String sql = "update restaurant set category=?, storename=?, address=? , storenumber=?, parking=? where idx=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,dto.getCategory());
			pstmt.setString(2, dto.getStorename());
			pstmt.setString(3, dto.getAddress());
			pstmt.setString(4, dto.getStorenumber());
			pstmt.setString(5, dto.getParking());
			
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return row;
	}
	
	
	



}
