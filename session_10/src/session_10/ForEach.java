package session_10;

public class ForEach {
	
	public enum Seasons{SUMMER,WINTER,SPRING,AUTUMN}

	public static void main(String[] args) {
		
		for(Seasons s1:Seasons.values())
		{
			System.out.println(s1+" "+s1.ordinal());
		}

	}

}
