import java.util.*;
public class Comparison2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a:");
        int a = sc.nextInt();
        System.out.println("Enter the number b:");
        int b = sc.nextInt();

        if (a==b){
            System.out.println("Both numbers Equal");
        }else if(a>b) {
                System.out.println("a is greater");
            }else {
                System.out.println("a is lesser");
            }
        }
    }


