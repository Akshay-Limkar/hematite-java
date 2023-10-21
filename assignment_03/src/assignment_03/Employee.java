package assignment_03;

public class Employee {
	
	private static int empNo=1;
	private int incNo=0;
	private String name;
	private double salary;
	private static int totalEmp;
	private static double totalSalary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
		this.incNo = empNo;
		empNo++;
		totalEmp++;
		totalSalary = totalSalary + salary;
	}
	
	public String toString() {
		return "Employee ID :"+incNo+" Name :"+name+" Salary :$"+salary;
	}

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Akshay",25000.55);
		Employee emp2 = new Employee("Gaurav",30000.65);
		Employee emp3 = new Employee("Shubham",35000.75);
		Employee emp4 = new Employee("Ranjit",45000.45);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		System.out.println("Total Employees : "+totalEmp);
		System.out.println("Total Salary :$"+totalSalary);
	}

}
