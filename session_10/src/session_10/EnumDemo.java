package session_10;

public class EnumDemo {
	
	public enum Seasons{SUMMER,WINTER,SPRING,AUTUMN}

	public static void main(String[] args) {
		
		Seasons s = Seasons.SUMMER;
		System.out.println(s+" "+s.ordinal());

	}

}
