package Recursion;

public class PowerXton {
	public static int calcPower(int x,int n) {
		if (n==0) 
		{	//Base Case 1
			return 1;
		}
		if (x==0) 
		{	//Base Case 2
			return 0;
		}
		int xPownm1 = calcPower(x,n-1);       //Kaam
		int xPown = x*xPownm1;
		return xPown;
		
	}
	public static void main(String[] args) {
		int a = 2,b=5;
		int ans = calcPower(a,b);
		System.out.println(ans);

	}

}
