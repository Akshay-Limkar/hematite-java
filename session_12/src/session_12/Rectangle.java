package session_12;

public class Rectangle extends Shape {

		int l, b;

		public Rectangle (int l, int b) {
			super();
			this.l=l;
			this.b=b;
		}
		@Override
		public double CalculateArea() {
			
			return (l*b);
		}

}
