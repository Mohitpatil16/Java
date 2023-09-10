package ZensarEsd;

 public class ICICI_Bank extends Bank {
    @Override
    public void deposite() {
        System.out.println("Depositing Money from ICICI Bank");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawing Money from ICICI Bank");
    }

//	public final void rate_of_intrest() {
//		System.out.println("Rate of Intrest: " + 10.5);
//	}
}