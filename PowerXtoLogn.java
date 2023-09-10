package Recursion;

public class PowerXtoLogn {
	

	
		public static int calcPower(int x,int n) {
			if (n==0) 
			{
				return 1;
			}
			if (x==0) 
			{
				return 0;
			}
			// if n is even
			if(n%2==0) 
			{
				return calcPower(x,n/2) * calcPower(x,n/2);
			}
			else 
			{	//n is odd 
				return calcPower(x,n/2)*calcPower(x,n/2)*x;
			}
		}
		public static void main(String[] args) {
			int a = 2,b=5;
			int ans = calcPower(a,b);
			System.out.println(ans);

		}

	}
	


