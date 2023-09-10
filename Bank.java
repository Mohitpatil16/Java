package ZensarEsd;

 public class Bank {
    public float rate_of_intrest = 10.5f;


    public void deposite() {
        System.out.println("Depositing Money from Bank");
    }

    public void withdraw() {
        System.out.println("Withdrawing Money from Bank");
    }

    public final void rate_of_intrest() {
        System.out.println("Rate of Intrest: " + rate_of_intrest);
    }
}
