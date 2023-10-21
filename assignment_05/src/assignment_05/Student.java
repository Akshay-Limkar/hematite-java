package assignment_05;
public class Student {
	
	private int rollNo, sub1, sub2, sub3, total;
	private String name;
	
	public Student(int rollNo, String name, int sub1, int sub2, int sub3) {
		this.rollNo=rollNo;
		this.name=name;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		total = sub1+sub2+sub3;
	}
	
	@Override
	public String toString() {
		return name+" [RollNo: "+rollNo+", Sub1Marks: "+sub1+", Sub2Marks: "+sub2+", Sub3Marks: "+sub3+", Total= "+total+"]";
	}



	public static void main(String[] args) {
		
		Student st1 = new Student(111,"Akshay",85,72,76);
		Student st2 = new Student(112,"Gaurav",75,72,70);
		Student st3 = new Student(113,"Shubham",75,82,86);
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		
	}

}
