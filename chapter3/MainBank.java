public class MainBank{
    public static void main(String[]args){
        Bank bnk = new Bank("Anup Gautam", 12345, "Saving", 1000000);
        bnk.CheckBalance();
        bnk.Deposit(1000000);
        bnk.Withdraw(200000);
        bnk.Details();
    }
}
