
public class BankAccount 
{
    private int balance;

    public BankAccount(int initialBalance)
    { this.balance = initialBalance;}

    public void deposit(int amt)
    { balance ++; }

    public void withdraw(int amt)
    { 
        if (amt > balance)
        { System.out.println("Insufficient funds"); }

        else
        { balance --; }
    }
        
    public int getBalance()
    {  return balance; }
}