import java.util.Scanner;

class ATM 
{

    float balance;
    int pin = 6350;

    public void checkPin()
    {
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int pin_entered = sc.nextInt(); 

        if(pin_entered == pin)
        {
            menu();
        }

        else
        {
            System.out.println("Wrong PIN. Please enter the correct PIN.");
            menu();
        }
    }

    public void menu()
    {
        System.out.println("Type: ");
        System.out.println("1 - Check a/c balance ");
        System.out.println("2 - Withdraw money ");
        System.out.println("3 - Deposit money ");
        System.out.println("4 - Exit ");
        System.out.println("Enter your choice: ");


        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1)
        {
            checkBalance();
        }

        else if(opt == 2)
        {
            withdrawMoney();
        }

        else if(opt == 3)
        {
            depositMoney();
        }

        else if(opt == 4)
        {
            return;
        }

        else
        {
            System.out.println("Please enter a valid choice.");
        }
    }

    public void checkBalance()
    {
        System.out.println("Available balance: "+balance);
        menu();
    }

    public void withdrawMoney()
    {
        System.out.println("Enter the amount you want to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amt = sc.nextFloat();

        if(amt > balance)
        {
            System.out.println("Insufficient balance");
        }

        else
        {
            balance = balance - amt;
            System.out.println("Transaction successful.");
        }
        menu();
    }

    public void depositMoney()
    {
        System.out.println("Enter the amount:");
        Scanner sc = new Scanner(System.in);
        float amt = sc.nextFloat();
        balance += amt;
        System.out.println("Transaction successful.");
        menu();
    }
 
}

public class Atm_interface 
{
    public static void main(String[] args) {
        ATM ob = new ATM();
        ob.checkPin();
    }    
}
