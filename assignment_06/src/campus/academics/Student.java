package campus.academics;

import campus.data.Person;

public class Student extends Person {

	protected int rollNo;
	protected String branch, sem;
	
	public int getRollNo() {
		return rollNo;
	}
	public String getBranch() {
		return branch;
	}
	public String getSem() {
		return sem;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public void setSem(String sem) {
		this.sem = sem;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", branch=" + branch + ", sem=" + sem + "]";
	}
	
}
