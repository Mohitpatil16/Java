package JavaOperators;

public class Logical {
	boolean a = true;
	boolean b = false;
	
	public void printResult() {
		System.out.println("a = true, b = false");
		System.out.println("a && b: " + (a && b));
		System.out.println("a || b: " + (a || b));
		System.out.println("!(a && b): " + !(a && b));
	}
}
