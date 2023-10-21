public class Student {

	private int rn;
	private String name;
	private static int count;
	@SuppressWarnings("unused")
	private static String colName;
	
	public Student(int rn, String name)
	{
		this.rn = rn;
		this.name = name;
		count++;
	}
	
	public static int getCount()
	{
		return count;
	}
	
	public String toString()
	{
		return "Student [rn = "+rn+", Name = "+name+"]";
	}
	
	static
	{
		count = 50;
	}
	
	static 
	{
		colName = "DYP";
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Gaurav");
		Student s2 = new Student(2,"Akshay");
		Student s3 = new Student(3,"Shubham");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("Student Count = "+Student.getCount());

	}

}
