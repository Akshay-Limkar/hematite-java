public class MyDate {

		int dd,mm,yy;
		public void initDate()
		{
			dd = mm = yy = 1;
		}
		
		public void displayDate()
		{
			System.out.println("Date=["+dd+"/"+mm+"/"+yy+"]");
		}
		
		public static void main(String []args)
		{
			MyDate m = new MyDate();
			m.initDate();
			m.displayDate();
		}
}
