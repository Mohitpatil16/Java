package S;

public class StringcharAt {
    public static void main (String args[]){
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName+ "@" + " " + lastName;
        for(int i=0; i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
