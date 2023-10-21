package assignment_08;

public abstract class Factorial extends Processor {

	public void process() {
		for (int i = 1; i <= no; i++) {
			int fact = 1;
			fact = fact * i;
			System.out.println(fact);
		}
	}
}
