package session_10;

public class EDemo {
	
	public enum Coffee{ SMALL(35), MEDIUM(50), LARGE(75);
		
		private int price;
		private Coffee(int price) {
			this.price = price;
		}
		
		public int getPrice() {
			return price;
		}
	}

	public static void main(String[] args) {
		
		Coffee c = Coffee.MEDIUM;
		System.out.println(c+" Price = Rs. "+c.getPrice());

	}

}
