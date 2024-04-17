
public class SavingsAccount extends BankAccount
{
    public SavingsAccount(int initialBalance)
    { super(initialBalance); }

    @Override
    public void withdraw(int amt)
    {
        if (getBalance() - amt < 100)
        { System.out.println("Balance above $100 must be maintained"); }
        else
        { super.withdraw(amt); }
    }
}
