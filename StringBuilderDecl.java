package StringBuilder;

public class StringBuilderDecl {
    public static void main (String [] args){
        //Declaration
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // get a char from index
        //Get char
        System.out.println(sb.charAt(0));
        System.out.println(sb.charAt(3));

        //Set a Character at index
        //setChar
        sb.setCharAt(0,'P');
        System.out.println(sb);

    }
}
