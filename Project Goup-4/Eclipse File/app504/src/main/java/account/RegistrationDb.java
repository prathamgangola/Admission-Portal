package account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RegistrationDb {
	public static void handleAccountDetails(String studentName,String fathersName,String mothersName,String age,String gender,String address,String course,String percentssc,String percenthsc,String fee) {
		System.out.printf("%s  %s ",studentName,fathersName,mothersName,age,gender,address);
	
		String url = "jdbc:sqlserver://NG6108:1433;databaseName=db87;user=user87;password=db87;";
		
		Connection con;
		try {
			
		con = DriverManager.getConnection(url);
		String sqlQuery = "INSERT INTO Student_info(Student_name,Father_Name,Mother_Name,Age,Gender,Address,Course,SSC_Marks,HSC_Marks,Registration_Fees) VALUES(?,?,?,?,?,?,?,?,?,?);";
		PreparedStatement st = con.prepareStatement(sqlQuery);
		st.setString(1,studentName);
		st.setString(2,fathersName);
		st.setString(3,mothersName);
		st.setString(4,age);
		st.setString(5,gender);
		st.setString(6,address);
		st.setString(7,course);
		st.setString(8,percentssc);
		st.setString(9,percenthsc);
		st.setString(10,fee);
		

		st.execute();			
		con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
	public static ArrayList<SignupData> queryDB() {
		String url = "jdbc:sqlserver://NG6108:1433;databaseName=db87;user=user87;password=db87;";
		ArrayList <SignupData> list = new ArrayList <SignupData>(); 
		Connection con;
		try {
			
		con = DriverManager.getConnection(url);
		String sqlQuery = "select Stud_id,Student_name,Father_Name,Mother_Name,Age,Gender,Address,Course,SSC_Marks,HSC_Marks,Registration_Fees from Student_info";
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
