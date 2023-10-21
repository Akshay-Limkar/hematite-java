package session_12;

public class Circle extends Shape {

		int radius;
		public Circle (int radius) {
			super();
			this.radius = radius;
		}
		@Override
		public double CalculateArea() {
			
			return 3.14f*radius*radius;
		}
}
