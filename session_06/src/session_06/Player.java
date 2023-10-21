package session_06;

public class Player {

	private String playerName, playerCountry;
	
	public Player()
	{
		this("Sachin","USA");
		System.out.println("Default Contructor Called");
		playerCountry = "INDIA";
	}
	public Player(String playerName, String playerCountry)
	{
//		this()
		System.out.println("Parametrized Constructor called");
		this.playerCountry = playerCountry;
		this.playerName = playerName;
	}
	public String toString()
	{
		return "Player Name = "+playerName+" Player Country = "+playerCountry;
	}
	
	public static void main(String[] args) {
//		Player p = new Player("Virat","Austrilia");
		Player p = new Player();
		System.out.println(p);

	}

}
