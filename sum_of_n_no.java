import java.util.Scanner;

public class sum_of_n_no {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }System.out.println("Sum of n natural is: "+sum);
    }

}
