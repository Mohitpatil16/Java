import java.util.*;
public class TwoDarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        //input
        for(int i = 0; i<rows ;i++){
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        //output
        int x = sc.nextInt();
        for (int i = 0; i<rows ; i++){
            for (int j = 0; j<cols ; j++){
                //compare with x
                if (numbers [i][j]==x)
                    System.out.println("x is found at locations ("+ i +","+j+")");
            }
            System.out.println();
        }
    }
}
