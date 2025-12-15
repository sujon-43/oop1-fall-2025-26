/*import java.util.*;
public class primenumber {

    public static void main(String[] args)
    {
         Scanner input  = new Scanner(System.in);

         System.out.print("Enter a number ");
         int number = input.nextInt();
         int count = 0;
         
            if(number%2==0)
            {
                
                System.out.println("This is prime number");
            }
            else{
                System.out.println("THis is not prime number");
            }
            
    
        



    }
    
}*/

/*import java.util.*;

public class primenumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int count = 0;

        for(int i=2; i<100; i++)
        {
            if(i%2==0)
            {
                count++;
            }
        }
        System.out.println("Number of prime number : " + count);

    }
}*/

//PRIME NUMBER

/*import java.util.*;

public class Factorial{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        int fact=1;

        for(int i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial is : " + fact);
    }
}*/


//SUM OF DIGIT AND REVERSE NUMBER
import java.util.*;

public class reverse{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int temp=num;
        int reminder, Sum=0;
       
        while(temp!=0){
            reminder = temp%10;
            Sum=Sum*10+reminder;
            temp=temp/10;
        }
        System.out.println("Reverse number is : " + Sum);
    }
}
