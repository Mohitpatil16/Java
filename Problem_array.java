import java.util.*;
// This program is also name as Linear search
public class Problem_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of an array: ");
        int numbers[] = new int[size];
        for (int i = 0; i<size ; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to find:");
        int x = sc.nextInt();

        for (int i = 0 ; i < numbers.length ; i++){
            if (numbers[i] == x){
                System.out.println("x is found at index:" + i);
            }
        }

    }
}
