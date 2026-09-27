
public class BankAccount{

   double accountbalance =0;

    public void deposit(double amount){

        if(amount <= 0){
            System.out.println("invalid deposit amount");
        }else{

         accountbalance = amount + accountbalance;
         System.out.println(accountbalance);
        }
    }
    public void withdraw(double amount){
           if(amount <= 0){
          System.out.println("invalid withdraw amount");
           }else{

        if(amount > accountbalance){
            System.out.println("there is not having the sufficient balance");
        }
        else {
             accountbalance = accountbalance-amount;
             System.out.println(accountbalance);
        }
           }
    }
    public void checkBalance(){
         System.out.println(accountbalance);
    }
        

    }

