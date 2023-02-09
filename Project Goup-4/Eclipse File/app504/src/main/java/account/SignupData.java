package account;

public class SignupData {
	private int stud_id;
	private String studentName;
	private String fathersName;
	private String mothersName;
	private String age;
	private String gender;
	private String address;
	private String course;
	private String percentssc;
	private String percenthsc;
	private String fee;

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	

	

	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getMothersName() {
		return mothersName;
	}

	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getPercentssc() {
		return percentssc;
	}

	public void setPercentssc(String percentssc) {
		this.percentssc = percentssc;
	}

	public String getPercenthsc() {
		return percenthsc;
	}

	public void setPercenthsc(String percenthsc) {
		this.percenthsc = percenthsc;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public SignupData(int stud_id, String studentName, String fathersName, String mothersName, String age,
			String gender, String address, String course, String percentssc, String percenthsc, String fee) {
		super();
		this.stud_id = stud_id;
		this.studentName = studentName;
		this.fathersName = fathersName;
		this.mothersName = mothersName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.course = course;
		this.percentssc = percentssc;
		this.percenthsc = percenthsc;
		this.fee = fee;
	}

	public SignupData() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((fathersName == null) ? 0 : fathersName.hashCode());
		result = prime * result + ((fee == null) ? 0 : fee.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((mothersName == null) ? 0 : mothersName.hashCode());
		result = prime * result + ((percenthsc == null) ? 0 : percenthsc.hashCode());
		result = prime * result + ((percentssc == null) ? 0 : percentssc.hashCode());
		result = prime * result + stud_id;
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
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
		SignupData other = (SignupData) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (fathersName == null) {
			if (other.fathersName != null)
				return false;
		} else if (!fathersName.equals(other.fathersName))
			return false;
		if (fee == null) {
			if (other.fee != null)
				return false;
		} else if (!fee.equals(other.fee))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (mothersName == null) {
			if (other.mothersName != null)
				return false;
		} else if (!mothersName.equals(other.mothersName))
			return false;
		if (percenthsc == null) {
			if (other.percenthsc != null)
				return false;
		} else if (!percenthsc.equals(other.percenthsc))
			return false;
		if (percentssc == null) {
			if (other.percentssc != null)
				return false;
		} else if (!percentssc.equals(other.percentssc))
			return false;
		if (stud_id != other.stud_id)
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		return true;
	}

	
	

}
/*
 * getter setter
 * zero arg constructor
 * All Arg constructor
 * toString 
 * hashcode and equals
 */
