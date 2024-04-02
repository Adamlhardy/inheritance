public class SavingsAccount extends BankAccount {

    public SavingsAccount(double initialBalance){
        super(initialBalance);

    }
@Override
public void Withdraw(double withdrawal) {
    if(GetBalance() - withdrawal  < 100){
        super.Withdraw(withdrawal);
    } else {
        System.out.println("Withdrawal unavailable. Account balance below $100.");
    }
}
    // @Override
    // public void Withdraw(double withdrawal){

    // }
}
