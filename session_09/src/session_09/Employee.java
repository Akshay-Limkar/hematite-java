package session_09;

public class Employee extends Object {
	
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	public boolean equals(Object o) {
	Employee e = (Employee)o;
	
	if((this.empId==e.empId) && (this.empName.equals(e.empName)))
		return true;
	else
		return false;
	}
	
	public String toString() {
		return "Employee [empId = "+empId+"empName = "+empName+"]";
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee (1,"Akshay");
		Employee e2 = new Employee (2,"Akshay");

		if(e1.equals(e2)) {
			System.out.println("Objects are equal");
		}else {
			System.out.println("Objects are not equal");
		}
		
	}

}