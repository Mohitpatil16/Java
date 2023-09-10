package ZensarEsd;

public class assFor {
    public static void main(String[] args){
        int cubeofNumbers[] = new int[9];
        for (int i =0; i<9; i++){
            int number = i+1;
            cubeofNumbers[i]=number*number*number;

        }
        int number = 1;
        for(int cube:cubeofNumbers){
            System.out.println(number+"="+cube);
            number++;
        }
    }

}
