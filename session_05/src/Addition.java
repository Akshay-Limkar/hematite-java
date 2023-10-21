public class Addition {

	public void add(int a,int b)
	{
		System.out.println("Addition = "+(a+b));
	}
	public int add(int a,int b,int c)
	{
		return(a+b+c);
	}	
	public void add(int a,int b,int c,int d,int e)
	{
		System.out.println("SUM = "+(a+b+c+d+e));
	}
	
	public static void main(String[] args) {
	Addition a = new Addition();
	a.add(10, 20);
	System.out.println("SUM = "+a.add(1,2,3));

	}

}