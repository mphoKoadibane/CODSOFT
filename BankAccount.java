
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    public  String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double initialBalance)
    {
        this.accountNumber=accountNumber;
        this.balance=initialBalance;
    }
    public double getBalance()
    {
        return balance;
    }
    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance +=amount;
            System.out.printf("$%.2f deposited successfully into account",amount,accountNumber);
            
        }
        else
        {
            System.out.println("Deposit amount must be positive");
        }
    }
    public boolean withdraw(double amount)
    {
        if(amount > 0)
        {
            if(amount<=balance)
            {
                balance -=amount;
                System.out.printf("$%,2f withdrawan successfully from account %s.%n",amount,accountNumber);            
            
                return true;
            
            }else
            {
                System.out.println("Insuffiecient balance for this withdrawal");
                return false;
                
            }
          
        
        }
        else
        {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }
    }
}
