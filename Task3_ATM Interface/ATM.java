
import java.util.*;
public class ATM{

    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        BankAccount account  = new BankAccount();

        int choices =0;

        while(choices != 4){

            System.out.println("1.Deposit");
            System.out.println("2.withdraw");
            System.out.println("3.checkbalance");
            System.out.println("4.exit");

            choices = in.nextInt();
             
        if(choices == 1){
                System.out.println("enter your deposit amount");
                 double deposit = in.nextDouble();
                account.deposit(deposit);
        

        }else if(choices == 2){
            System.out.println("enter your withdraw amount");
            double withdraw = in.nextDouble();
            account.withdraw(withdraw);

        }else if(choices == 3){
             account.checkBalance();
        }else if (choices == 4){
            System.out.println("thank you  for using ATM");
        }
        else{
            System.out.println("invalid choices");
        }
        }
        

    }
}