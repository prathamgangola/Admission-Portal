package account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccountBO {
	public static void handleAccountDetails(String login_id, String login_password) {
		System.out.printf("%s  %s", login_id, login_password);
	
		String url = "jdbc:sqlserver://localhost:1433;databaseName=gamezone1;user=sa;password=1234;";
		
		Connection con;
		try {
			
		con = DriverManager.getConnection(url);
		String sqlQuery = "INSERT INTO stud_account(login_id, login_password) VALUES(?,?);";
		PreparedStatement st = con.prepareStatement(sqlQuery);
		st.setString(1, login_id);
		st.setString(2, login_password);
		st.execute();			
		con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
	public static ArrayList<SignupData> queryDB() {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=gamezone1;user=sa;password=1234;";
		ArrayList <SignupData> list = new ArrayList <SignupData>(); 
		Connection con;
		try {
			
		con = DriverManager.getConnection(url);
		String sqlQuery = "select stud_id, login_id, login_password from stud_account";
		PreparedStatement st = con.prepareStatement(sqlQuery);
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			SignupData ob = new SignupData(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),  rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11));
			list.add(ob);
		}
		
		st.execute();			
		con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
/*
	create table stud_account(stud_id int identity(1,1) primary key, login_id varchar(40) not null, login_password varchar(40) not null)
*/