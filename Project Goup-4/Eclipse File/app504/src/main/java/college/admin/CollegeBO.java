package college.admin;

import java.util.ArrayList;

public class CollegeBO {
	static public ArrayList<CourseEntity> GetCourses(			
			) {
		return CollegeDBO.GetCourses();
	}
	static public boolean AddStudent(
			String student_name, 
			String email_id, 
			String login_password, 
			String phone_number
			) {
		return CollegeDBO.AddStudent(student_name, email_id, login_password, phone_number);
	}
	static public boolean CheckLogin(
			String login_id,
			String login_password) {
		return CollegeDBO.CheckLogin(login_id, login_password);
	}
	static public boolean ChangePassword(
			String login_id,
			String new_password) {
		return CollegeDBO.ChangePassword(login_id, new_password);
	}
}
