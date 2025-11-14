
import java.util.*;


public class mortgagecalculator1 
{
   public static void main(String[] args)
   {
      
    Scanner input = new Scanner(System.in);

      double salary =0 ;
      int score = 0;
      
    
    while(true){
      System.out.print("Enter your Monthly salary : ");
      
      if(input.hasNextDouble())
      {
         salary = input.nextDouble();
         if(salary>=100000){
          
            break;
         }
         else{
            System.out.println("salary must have more than 100000");
         }
      }
      else{
         System.out.println("Invalid input!Please enter a numeric value");
         input.next();
      }
    }

      //for credit score

      while(true){
      System.out.print("Enter your Credit score (0-500) : ");
      
      if(input.hasNextInt())
      {
         score = input.nextInt();
         if(score>=200 && score<=500){
          
            break;
         }
         else{
            System.out.println("Credit score must be between in range (0-500)");
         }
      }
      else{
         System.out.println("Invalid input!Please enter a number value");
         input.next();
      }

    }

    //for criminal record

     System.out.print("Do you have any criminal record? (true/false) :  ");
    while(input.hasNextBoolean()){
     
      boolean criminal = input.nextBoolean();
        if(criminal==false)
        {
         System.out.println("Congratulations! you are eligible for loan");
            break;
          }
         
         else{
            System.out.println("Invalid input! please type (true or false)");
            input.next();
         }
      }
      
        
        System.out.print("Enter your desired loan : ");
      double loan = input.nextDouble();
      if(loan>=salary*2)
      {
        System.out.println("Loan request denied.");
        System.out.println("Reason : Loan amount must be unedr 2 times your salary");
      }
else
{
      System.out.println("=== Bangladesh Mortgage Calculator ===");
    
    System.out.print("Enter annual interest rate (in %) : ");
    Float rate = input.nextFloat();
    System.out.print("Enter loan term (in years) : ");
    Float year = input.nextFloat();

    double r = (rate/100)/12;
    float n = year*12;
    
    double num = r * Math.pow(1+r,n);
    Double  din = Math.pow(1+r,n)-1;

    Double M = loan*(num/din);
    Double interestamount = M*n- loan;
    
    System.out.println("=== Mortgage Summary");
    System.out.println("Loan amount : " + loan);
    System.out.println("Monthly payment : " + M );
    System.out.println("Total payment : " + M*n);
    System.out.println("total interest amount : " + interestamount);
      }
      
       
  }
}
