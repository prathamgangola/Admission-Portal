package college.admin;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class CollegeDBO {
	static private String url = "jdbc:sqlserver://localhost:1433;databaseName=db_college_adm;user=sa;password=1234;";
	static public ArrayList<CourseEntity> GetCourses() {
		ArrayList<CourseEntity> list = new ArrayList<CourseEntity>();
		Connection con;
		try {			
			con = DriverManager.getConnection(url);
			String sqlQuery = "{call GetCourses()}";
			CallableStatement st = con.prepareCall(sqlQuery);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				int course_id = rs.getInt(1);
				String course_name = rs.getString(2);
				String course_detail = rs.getString(3);
				double course_fee = rs.getDouble(4);				
				
				CourseEntity ob = new CourseEntity(course_id, course_name, course_detail, course_fee);
				
				list.add(ob);				
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	static public boolean AddStudent(
			String student_name, 
			String email_id, 
			String login_password, 
			String phone_number
			) {
		boolean result=false;
		Connection con;
		try {			
			con = DriverManager.getConnection(url);
			String sqlQuery = "{call AddStudent(?,?,?,?)}";
			CallableStatement st = con.prepareCall(sqlQuery);
			st.setString(1,student_name);
			st.setString(2,email_id);
			st.setString(3,login_password);
			st.setString(4,phone_number);
			result = st.execute();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
			result=false;
		}
		return result;
	}
	static public boolean CheckLogin(
			String login_id,
			String login_password) {
		int count = 0;
		Connection con;
		try {			
			con = DriverManager.getConnection(url);
			String sqlQuery = "{call CheckLogin(?,?)}";
			CallableStatement st = con.prepareCall(sqlQuery);
			st.setString(1, login_id);
			st.setString(2, login_password);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);			
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return count != 0;
	}
	static public boolean ChangePassword(
			String login_id,
			String new_password) {
		boolean result=false;
		Connection con;
		try {			
			con = DriverManager.getConnection(url);
			String sqlQuery = "{call ChangePassword(?,?)}";
			CallableStatement st = con.prepareCall(sqlQuery);
			st.setString(1,login_id);
			st.setString(2,new_password);
			result = st.execute();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
			result=false;
		}
		return result;
	}
}
