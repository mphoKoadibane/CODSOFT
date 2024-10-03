import java.util.Scanner;

/**
 * Write a description of class ATMInterface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * import java.util.Scanner;
 */
 
public class ATMInterface
{
    private BankAccount account;
    private Scanner scanner;
    
    public ATMInterface(BankAccount account)
    {
        this.account=account;
        this.scanner= new Scanner(System.in);
    }
    //method to check the balance using the back account instance
    public void deposit()
    {
        System.out.print("Enter amount to deposit: $");
        double amount= getValidAmount();
        if(amount>0)
        {
            account.deposit(amount);
            System.out.printf("Deposit of $%.2f successful.%n",amount);
        }
        
        
    }
    public void checkBalance()
    {
        double balance= account.getBalance();
        System.out.printf("Account %s0 - Current balance: s%.2f%n", account.accountNumber,balance);
    }

    public void Withdraw()
    {
        System.out.println("Enetr amount to withdraw: $");
        double amount=getValidAmount();
        if (amount>0)
        {
            boolean success= account.withdraw(amount);
            if(success)
            {
                System.out.printf("Withdrawal of $%.2f successful.%n",amount);
            }
            else
            {
                System.out.println("Withdrawal failed.");
            }
        }
    }
    private double getValidAmount()
    {
        while(true)
        try{
            double amount=Double.parseDouble(scanner.nextLine());
            if(amount>0)
            {
                return amount;
            }
            else
            {
                System.out.println("Amount must be positive. Please try again:");
            }
         }catch(NumberFormatException e)
         {
             System.out.println("Invalid input. Please enter a numberic value:");
         }
    }
    public void displayMenu()
    {
        while(true)
        { 
         System.out.println("\nWelcome to the ATM");
         System.out.println("1.Check Balance");
         System.out.println("2.Deposit Money");
         System.out.println("3.Withdraw Money");
         System.out.println("4.Exit");
         
         System.out.print("Please select an option (1-4):");
         String choice=scanner.nextLine();
         switch(choice)
         {
             case"1":
                checkBalance();
                break;
             case"2":
                deposit();
                break;
             case"3":
               Withdraw();
               break;
             case"4":
               System.out.println("Thank you for using the ATM. Goodbye!");
               return;
               default:
                  System.out.println("Invalid option. Please select a valid option(1-4)");
            }
        }
    }
    public static void main(String[]args)
    { 
        BankAccount userAccount = new BankAccount("123456789",1000.0);
        ATMInterface atm = new ATMInterface(userAccount);
        atm.displayMenu();
        
        
    }
    }
    
