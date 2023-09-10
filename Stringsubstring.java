package S;

public class Stringsubstring {
    public static void main (String[] args){
        String sentence = "My name is tony";
        //substring(beg index , end index)
        String name = sentence.substring(11,sentence.length());
        System.out.println(name);
        System.out.println(sentence.substring(0,4));
        System.out.println(sentence.substring(0,9));
    }
}
