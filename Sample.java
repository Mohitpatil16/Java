package ZensarEsd;

public class Sample {



    public static void main(String[] args) {


        Bank b = new Bank();
        HDFC_Bank hdfc_bank = new HDFC_Bank();
        ICICI_Bank icici_bank = new ICICI_Bank();

        b.rate_of_intrest = 20.5f;

        b.deposite();
        b.withdraw();

        b.rate_of_intrest();

        System.out.println();

        hdfc_bank.deposite();
        hdfc_bank.withdraw();

        System.out.println();

        icici_bank.deposite();
        icici_bank.withdraw();



    }

}