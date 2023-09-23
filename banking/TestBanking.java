package banking;
import banking.*;

public class TestBanking {

        public static void main(String[] args){
            Customer customer;
            Account account;
            //Creat an account that can has a 500.00 balance.
            System.out.println("Creat an account that can has a 500.00 balance");
            customer = new Customer("zexu","Liu");
            customer.setAccount(new Account(500.00));
            account = customer.getAccount();
            //Perform some account transactions
            System.out.println("Withdraw 150.00:" + account.withdraw(150.00));
            System.out.println("Withdraw 22.50:" + account.deposit(22.50));
            System.out.println("Withdraw 47.62:" + account.withdraw(47.62));
            System.out.println("Withdraw 400.00:" + account.withdraw(400.00));
            //print out final account balance
            System.out.println("Customer[" + customer.getLastName() + "£¬" + customer.getFirstName() + "] has a balance of " + account.getBalance());
        }
    }
