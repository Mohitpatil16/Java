package StringBuilder;

public class SbReverseString {
    public static void main (String [] args){
        StringBuilder sb = new StringBuilder("Hello World");

        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-i-1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar); //(index, char)
            sb.setCharAt(back,frontChar); //(index, char)
        }
        System.out.println(sb);
    }
}
