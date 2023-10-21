package session_06;

public class Employee {
	
	private int empId;
	private String empName;
	private double empSalary;
	
	public Employee()
	{
		System.out.println("Default Constructor Called...");
		empId = 111;
		empName = "Akshay";
		empSalary = 30000.99;
	}
	public Employee(int id, String name, double sal)
	{
		System.out.println("Parameterized Constructor Called...");
		empId = id;
		empName = name;
		empSalary = sal;
	}

	public static void main(String[] args) {
		
		Employee e = new Employee();
		System.out.println(e.empId+" "+e.empName+" "+e.empSalary);
		
		Employee e1 = new Employee();
		System.out.println(e1.empId+" "+e1.empName+" "+e1.empSalary);
	}

}
