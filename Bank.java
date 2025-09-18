import java.util.HashMap;
import java.util.Scanner;

public class Bank{
   static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        
       System.out.println("Enter Your Name :");
       String name=sc.next();

       System.out.println("Enter your Address :");
       String address=sc.next();

       Customer customer=new Customer(name, address);

       System.out.println("Enter Your Account Number :");
       int accNo=sc.nextInt();

       System.out.println("Enter Your Initial Balance :");
       double balance=sc.nextDouble();

       Account account=new Account(accNo, balance, customer);

       HashMap <Integer,Account> info=new HashMap<>();

       System.out.println("Choose One Of the Following Options :");
       System.out.println("1.Create Account ");
       System.out.println("2.Deposit");
       System.out.println("3.Withdraw");
       System.out.println("4.Check Balance");
       System.out.println("5.Exit");

       
        
    }

}