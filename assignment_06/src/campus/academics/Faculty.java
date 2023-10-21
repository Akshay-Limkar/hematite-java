package campus.academics;

import campus.data.Person;

public class Faculty extends Person{

	protected String Fname, branch;
	protected double sal;
	
	public String getName() {
		return Fname;
	}
	public String getBranch() {
		return branch;
	}
	public double getSal() {
		return sal;
	}
	public void setName(String Fname) {
		this.Fname = Fname;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Faculty [name=" + Fname + ", branch=" + branch + ", sal=" + sal + "]";
	}
	
}
