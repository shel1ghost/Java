public class Bank{
    private String name, acc_type;
    int acc_num, balance;
    public Bank(String n, int accnum, String acctype, int bal){
        name = n;
        acc_num = accnum;
        acc_type = acctype;
        balance = bal;
    }

    public void CheckBalance(){
        System.out.println("Balance: "+balance);
    }

    public void Deposit(int amount){
        balance+=amount;
        System.out.println("Rs."+amount+" deposited!");
    }

    public void Withdraw(int amount){
        balance-=amount;
        System.out.println("Rs."+amount+" withdrawn!");
    }

    public void Details(){
        System.out.println("Name: "+name);
        System.out.println("Account Number: "+acc_num);
        System.out.println("Account Type: "+acc_type);
        System.out.println("Balance: "+balance);
    }
}
