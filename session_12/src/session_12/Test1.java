package session_12;

public class Test1 {

	public static void main(String[] args) {
		
//		Shape s = new Shape(); //Cannot be instantiate
		
		Shape s = new Circle(5);
		System.out.println("Area of Circle is = "+s.CalculateArea());
		
		Rectangle r = new Rectangle(8,6);
		System.out.println("Area of Rectangle is = "+r.CalculateArea());

	}

}
