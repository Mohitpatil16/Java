// package JavaOperators;

public class Misc {
	int age = 20;
	
    String canDrive = (age >= 18) ? "Yes" : "No";
	
	
    public void printResult() {
    	System.out.println("Can I Drive: " + canDrive);
    	System.out.println("canDrive Instance of String: " + (canDrive instanceof String));
    }
	
}
