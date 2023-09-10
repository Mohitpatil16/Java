import java.util.*;
public class UserDefArray {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the elements of an array:");
        int numbers[] = new int[size];     // declared the array
        //input
        for (int i=0; i<size ; i++){
            numbers[i] = sc.nextInt();
        }

        //output
        for (int i=0; i<size ; i++){
            System.out.println(numbers[i]);
        }
    }
}
