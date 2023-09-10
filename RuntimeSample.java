package ZensarEsd;
import java.io.IOException;
public class RuntimeSample {
    public static void main (String [] args) throws IOException{
//        Runtime.getRuntime().exec("notepad");
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total memory:"+ rt.totalMemory());
        System.out.println("Free Memory:"+ rt.freeMemory());
    }

}
