public class MyDate {
	
	public int add(int... a)
	{
		int count = a.length;
		int sum =0;
		
		for(int i=0; i<count; i++)
		{
			sum = sum+a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		MyDate a = new MyDate();
		int addition = a.add(10,20);
		System.out.println("Addition = "+addition);
		System.out.println("SUM = "+a.add(1,2,3,8,7,66));

	}

}