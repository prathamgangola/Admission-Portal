package college.admin;

public class CourseEntity {
	private int course_id;
	private String course_name;
	private String course_detail;
	private double course_fee;
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_detail() {
		return course_detail;
	}
	public void setCourse_detail(String course_detail) {
		this.course_detail = course_detail;
	}
	public double getCourse_fee() {
		return course_fee;
	}
	public void setCourse_fee(double course_fee) {
		this.course_fee = course_fee;
	}
	public CourseEntity(int course_id, String course_name, String course_detail, double course_fee) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_detail = course_detail;
		this.course_fee = course_fee;
	}
	public CourseEntity() {
		super();
	}
	@Override
	public String toString() {
		return "CourseEntity [course_id=" + course_id + ", course_name=" + course_name + ", course_detail="
				+ course_detail + ", course_fee=" + course_fee + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course_detail == null) ? 0 : course_detail.hashCode());
		long temp;
		temp = Double.doubleToLongBits(course_fee);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + course_id;
		result = prime * result + ((course_name == null) ? 0 : course_name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseEntity other = (CourseEntity) obj;
		if (course_detail == null) {
			if (other.course_detail != null)
				return false;
		} else if (!course_detail.equals(other.course_detail))
			return false;
		if (Double.doubleToLongBits(course_fee) != Double.doubleToLongBits(other.course_fee))
			return false;
		if (course_id != other.course_id)
			return false;
		if (course_name == null) {
			if (other.course_name != null)
				return false;
		} else if (!course_name.equals(other.course_name))
			return false;
		return true;
	}
	
}
