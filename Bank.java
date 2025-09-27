import java.io.FileReader;
import java.io.FileWriter;
import java.io.IO;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class Bank{
   static Scanner sc =new Scanner(System.in);
   static Random r=new Random();
    public static void main(String[] args) {
       
       HashMap <Integer,Account> info=new HashMap<>();

       System.out.println("Hello and Welcome Dear !!!");

       

       boolean True=true;

       while(True)
       {
         System.out.println("\nChoose One Of the Following Options :");
         System.out.println("1.Create Account ");
         System.out.println("2.Deposit");
         System.out.println("3.Withdraw");
         System.out.println("4.Check Balance");
         System.out.println("5.Exit");
         int n=sc.nextInt();
         sc.nextLine();
            
              if(n==1)
              { 
                  System.out.println("So you wanna create an a new account");
                  System.out.println("Enter Your Name :");
                  String name=sc.nextLine();
                  System.out.println("Enter your Address :");
                  String address=sc.nextLine();
                  System.out.println("Enter Your Email");
                  String email=sc.nextLine();
                  Customer customer=new Customer(name, address,email);
                  int accNo=r.nextInt(100000,250000);
                  System.out.println("Enter Amount you want to add in Account (Minimum Rs.1000) :");

                while (true)
                {
                  double balance=sc.nextDouble();
                 if(balance>=1000)
                 {
                  Account account=new Account(accNo, balance, customer);
                  info.put(accNo,account);
                  System.out.println("You have created your Account ");
                  System.out.println("Your account Number is: " + accNo);
                  Bank.accountSave(account);
                  break;
                 }
                 else 
                 {
                  System.out.println("Please Enter Minimum Amount At least");
                 }
                 }
               }
               else if(n==2)
               {
                  if(info.isEmpty())
                  {
                     System.out.println("No account has been created yet");
                  }
                  else
                  {
                     System.out.print("Please Enter Your Account Number :");
                     int AccNo=sc.nextInt();
                     sc.nextLine();

                     if(info.containsKey(AccNo))
                     {
                        Account acc=info.get(AccNo);
                        System.out.print("Enter The amount you want to deposit: ");
                        double ac=sc.nextDouble();
                        sc.nextLine();

                        acc.deposit(ac);
                        System.out.println("Deposition Complete, New amount is" + acc.getBalance());
                        
                     }
                     else
                     {
                        System.out.println("Account not found");
                     }

                  }
               }
               else if(n==3)
               {
                   if(info.isEmpty())
                  {
                     System.out.println("No account has been created yet");
                  }
                  else
                  {
                     System.out.print("Please Enter Your Account Number :");
                     int AccNo=sc.nextInt();
                     sc.nextLine();

                     if(info.containsKey(AccNo))
                     {
                        Account acc=info.get(AccNo);
                        System.out.print("Enter the amount you want to withdraw: ");
                        double ac=sc.nextDouble();
                        sc.nextLine();

                        acc.withdraw(ac);
                        System.out.println("Transaction Successful, New balance is " + acc.getBalance());
                        
                     }
                     else
                     {
                        System.out.println("Account not found");
                     }

                  }
               }
               else if(n==4)
               {
                  if(info.isEmpty())
                  {
                     System.out.println("No account has been created yet");
                  }
                  else
                  {
                     System.out.print("Please Enter Your Account Number :");
                     int AccNo=sc.nextInt();
                     sc.nextLine();

                     if(info.containsKey(AccNo))
                     {
                        Account acc=info.get(AccNo);
                        System.out.println("Your current Balance is " + acc.getBalance());
                     }
                     else
                     {
                        System.out.println("Account not found");
                     }

                  }
               }
               else if(n==5)
               {
                  System.out.println("You are Exiting ....");
                  True=false;
                  sc.close();
               }
               else
               {
                  System.out.println("Please Enter Valid Choice");
               }

       }    
    }
    public static void accountSave(Account account){
      try
      {
         FileWriter writer=new FileWriter("account.txt",true);
      
         writer.write("Account Number: " + account.getAccountNumber()+" \n");
         writer.write("Account Holder Name: " + account.getCustomer().getName() + "\n");
         writer.write("Email: " + account.getCustomer().getECmail()+"\n");
         writer.write("Balance: " + account.getBalance());
         writer.write("Address: " +account.getCustomer().getAddress()+"\n\n-----------------------\n");
         writer.close();

      }
      catch(IOException e) 
      {
         System.out.println("Error saving account:" + e.getMessage());
         e.printStackTrace();
      }
    }
}