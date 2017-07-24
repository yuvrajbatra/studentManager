package studentManager;

public class studentManage {

	public String Name;
	public int RollNumber;

	public studentManage(String Name, int RollNumber) {
		this.Name = Name;
		this.RollNumber = RollNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public int getRollNumber() {
		return RollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.RollNumber = RollNumber;
	}
public void printInfo(){
	System.out.println(getName()+ "your Roll Number is" +getRollNumber());
}
}
