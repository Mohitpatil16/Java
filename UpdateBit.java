
package BitManipulation;
import java.util.*;
public class UpdateBit {
    public static void main(String[] args){
        System.out.println("Enter the opertion:- ");
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;

        int bitMask = 1<<pos;
        if (oper==1){
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);

        }
        else {
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask&n;
            System.out.println(newNumber);
        }
    }
}
