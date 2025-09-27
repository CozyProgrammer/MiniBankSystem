import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Bank{
   static Scanner sc =new Scanner(System.in);
   static Random r=new Random();
    public static void main(String[] args) {
       
       HashMap <Integer,Account> info=new HashMap<>();

       System.out.println("Hello and Welcome");

       

       boolean True=true;

       while(True){
         System.out.println("\nPlease Choose One Of the Following Options :");
         System.out.println("1.Create Account ");
         System.out.println("2.Deposit");
         System.out.println("3.Withdraw");
         System.out.println("4.Check Balance");
         System.out.println("5.Exit");
         int n=sc.nextInt();
         sc.nextLine();
            
         if(n==1){ 
             System.out.println("So you wanna create an a new account");
             System.out.println("Enter Your Name :");
             String name=sc.nextLine();

             System.out.println("Enter your Address :");
             String address=sc.nextLine();

             Customer customer=new Customer(name, address);

             int accNo=r.nextInt(100000,250000);

             System.out.println("Enter Amount you want to add in Account (Minimum Rs.1000) :");

            while (true){
            double balance=sc.nextDouble();

            if(balance>=1000){

             Account account=new Account(accNo, balance, customer);
             info.put(accNo,account);
             System.out.println("You have created your Account ");
             System.out.println("Your account Number is: " + accNo);
             break;
             } else {
             System.out.println("Please Enter Minimum Amount At least");
             }
             }

      }
      
      else if(n==2){

      }
      
      else if(n==3){

      }

      else if(n==4){

      }

      else if(n==5){
         System.out.println("You are Exiting ....");
         True=false;
         sc.close();

      }

      else{
         System.out.println("Please Enter Valid Choice");
      }

   }    
 }
}