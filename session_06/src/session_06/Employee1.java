package session_06;

public class Employee1 {
	private int empId;
	private String empName;
	private double empSalary;
	
	public Employee1()
	{
		System.out.println("Default Constructor Called...");
		empId = 111;
		empName = "Akshay";
		empSalary = 30000.99;
	}
	public Employee1(int empId, String empName, double empSalary)
	{
		System.out.println("Parameterized Constructor Called...");
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public static void main(String[] args) {
		
		Employee1 e = new Employee1();
		System.out.println(e.empId+" "+e.empName+" "+e.empSalary);
		
		Employee1 e1 = new Employee1();
		System.out.println(e1.empId+" "+e1.empName+" "+e1.empSalary);
	}

}
