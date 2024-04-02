public class BankAccount {

    private double checkingBalance;
  

    /**
     * Constructor requiring we pass a balance on instantiation
     * @param checkingBalance the balance the user provided when creating their account
     */
    public BankAccount(double checkingBalance){
        this.checkingBalance = checkingBalance;
    }

    /**
     * Will take the checkingBalance and add it to the existing balance
     * @param deposit the amount that should be added to the checkingBalance
     * @return
     */
    public void Deposit (double deposit){
        checkingBalance += deposit;
    }

    /**
     * Will take the withdraw amount and subtract it for the existing balance
     * @param withdrawal amount that should be removed from existing balance
     * @return
     */
    public void Withdraw(double withdrawal) {
        checkingBalance -= withdrawal;
    }

    public double GetBalance(){
        return checkingBalance;
    }

}