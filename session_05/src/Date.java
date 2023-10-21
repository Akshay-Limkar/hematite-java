public class Date {
	
	private int d;
	
	public void setD(int dd)
	{
		d = dd;
	}

	public int getD() 
	{
		return d;
	}
	
	public static void main(String[] args) {
		Date o = new Date();
		o.d = 10;
		System.out.println(o.d);
	}
	
}