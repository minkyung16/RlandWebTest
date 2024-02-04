package kr.co.rland.web.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.co.rland.web.entity.Menu;

public class JDBCMenuRepository implements MenuRepository {

	public List<Menu> findAll() {
		
		List<Menu> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@db.newlecture.com:1521/xepdb1";
			Connection con = DriverManager.getConnection(url,"RLAND","0530");
		
			String sql = "select * from MENU";
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				
				Menu m = new Menu();
				m.setId(rs.getInt("ID"));
				m.setKorName(rs.getString("KOR_NAME"));
				m.setEngName(rs.getString("ENG_NAME"));
				m.setLike(rs.getInt("LIKE"));
				m.setImg(rs.getString("img"));
				m.setPrice(rs.getInt("PRICE"));
				m.setRegDate(rs.getDate("REG_DATE"));
				
				list.add(m);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public Menu findById(String id) {
		
		Menu menu =null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@db.newlecture.com:1521/xepdb1";
			Connection con = DriverManager.getConnection(url,"RLAND","0530");
		
			String sql = "select * from MENU ";
			sql +="where id =" + id;
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			if(rs.next()) {
				menu = new Menu();
				menu.setId(rs.getInt("ID"));
				menu.setKorName(rs.getString("KOR_NAME"));
				menu.setEngName(rs.getString("ENG_NAME"));
				menu.setLike(rs.getInt("LIKE"));
				menu.setImg(rs.getString("img"));
				menu.setPrice(rs.getInt("PRICE"));
				menu.setRegDate(rs.getDate("REG_DATE"));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return menu;
	}

}
