import java.util.*;
public class Arrays {
    public static void main(String args[]){
        int marks[] = new int [3];
        marks[0] = 96;     //chem
        marks[1] = 98;     //phys
        marks[2] = 95;     //eng

        //System.out.println(marks);       //Gives garbage values
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // OR

        for( int i=0;i<3;i++){
            System.out.println(marks[i]);
        }


    }
}
