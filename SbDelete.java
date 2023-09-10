package StringBuilder;

public class SbDelete {
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("Tony");

        //Insert char
        sb.insert(0,'S');
        System.out.println(sb);

        sb.insert(5," Stark");
        System.out.println(sb);

        sb.delete(0,1);
        System.out.println(sb);

//        sb.delete(4,10);
        sb.delete(4,sb.length());
        System.out.println(sb);
    }
}
