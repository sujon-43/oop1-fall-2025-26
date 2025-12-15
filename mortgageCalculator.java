import java.util.*;



public class mortgageCalculator{
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    

    while(true){
      System.out.print("Enter your MOnthly salary : ");
      
      if(input.hasNextDouble())
      {
         double salary = input.nextDouble();
         if(salary>=100000){
            salary = salary;
         }
         else{
            System.out.println("salary must have more than 100000");
         }
      }
      else{
         System.out.println("Invalid input!Please enter an intizer number");
         input.next();
      }

      //for credit score

      while(true){
      System.out.print("Enter your Credit score : ");
      
      if(input.hasNextInt())
      {
         int score = input.nextInt();
         if(score>=200 && score<=500){
            score = score;
         }
         else{
            System.out.println("Credit score must be between in range (200-500)");
         }
      }
      else{
         System.out.println("Invalid input!Please enter a number value");
         input.next();
      }

    }

    }
}
 
    /*System.out.println("=== Bangladesh Mortgage Calculator ===");
    System.out.println("Enter principal loan amount : ");
    Double amount = input.nextDouble();
    System.out.println("Enter annual interest rate (in %) : ");
    Float rate = input.nextFloat();
    System.out.println("Enter loan term (in years) : ");
    Float year = input.nextFloat();

    double r = (rate/100)/12;
    float n = year*12;
    
    double num = r * Math.pow(1+r,n);
    Double  din = Math.pow(1+r,n)-1;

    Double M = amount*(num/din);
    Double interestamount = M - amount;
    
    System.out.println("=== Mortgage Summary");
    System.out.println("Loan amount : BDT" + amount);
    System.out.println("Monthly payment : " + M );
    System.out.println("Total payment : " + M*n);
    System.out.println("total interest amount : " + interestamount);*/

    
    }
}
