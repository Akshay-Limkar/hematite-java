package array;

public class SwapDate {
	
	private int dd,mm,yy;
	
	public SwapDate(int dd, int mm, int yy) {
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	/*public static void Date(SwapDate d1, SwapDate d2) {
		SwapDate temp;
		temp=d1;
		d1=d2;
		d2=temp;
	}*/
	
	public static void Date(SwapDate[] d) {
		SwapDate temp;
		temp=d[0];
		d[0]=d[1];
		d[1]=temp;
	}
	
	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}

	public static void main(String[] args) {
		
		/*SwapDate d1 = new SwapDate(18,10,2022);
		SwapDate d2 = new SwapDate(17,11,2023);*/
		
		SwapDate d[] = new SwapDate[2];
		d[0] = new SwapDate(18,10,2022);
		d[1] = new SwapDate(17,11,2023);
		System.out.println("Before Swap --> ");
		System.out.println(d[0]);
		System.out.println(d[1]);
		SwapDate.Date(d);
		System.out.println("After Swaped --> ");
		System.out.println(d[0]);
		System.out.println(d[1]);

	}

}
