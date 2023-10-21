package que1;

public abstract class Circle extends Processor {

	public void process() {
		double pi=3.14, area=0;
		area = pi*no*no;
		
		System.out.println(area);
	}
}
