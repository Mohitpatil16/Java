package ZensarEsd;

 public class HDFC_Bank extends Bank {
    @Override
    public void deposite() {
        System.out.println("Depositing Money from HDFC Bank");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawing Money from HDFC Bank");
    }

//	public final void rate_of_intrest() {
//		System.out.println("Rate of Intrest: " + 10.5);
//	}
}
