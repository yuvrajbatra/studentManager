package studentManager;

public class studentManage {

	public String Name;
	public int RollNumber;
	public String Dob;
	public int StudentClass;

	public studentManage(String name, int rollNumber, String dob, int StudentClass) {
		this.Name = name;
		this.RollNumber = rollNumber;
		this.Dob = dob;
		this.StudentClass = StudentClass;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getRollNumber() {
		return RollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.RollNumber = rollNumber;
	}

	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		this.Dob = dob;
	}

	public int getStudentClass() {
		return StudentClass;
	}

	public void setStudentClass(int studentClass) {
		this.StudentClass = studentClass;
	}

	public void printInfo() {
		System.out.println("name-" + " " + getName() + "     " + "Roll Number-" + " " + getRollNumber() + "     "
				+ "Date of birth-" + getDob() + "     " + "Class-" + getStudentClass());
	}

	public class test {

	}
}
