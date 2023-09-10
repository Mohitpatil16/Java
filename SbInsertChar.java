package StringBuilder;

public class SbInsertChar {
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("tony");
        //Insert char
        sb.insert(0,'S');
        System.out.println(sb);
        sb.insert(5," Stark");
        System.out.println(sb);

    }
}
