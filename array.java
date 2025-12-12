/*import java.util.*;

public class Array{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] array = new int[5];
        array[0]=10;
        array[1]=780;
        array[2]=30;
        array[3]=108;
        array[4]=189;
        System.out.println(array);//for array adress
        System.out.println(Arrays.toString(array));//for print array

        System.out.println("enter the size of array : ");
        int n = input.nextInt();

        int[] numbers=new int[n];
        System.out.println("OKay! Now Enter the numbers");
        for(int i=0; i<n; i++){
            numbers[i]=input.nextInt();
        }
        System.out.println("Numbers are");
        for(int i=0; i<n; i++){
            //System.out.println("numbers are : "+numbers[i]);
            System.out.print(numbers[i]);
            //System.out.println(" ");
            
        }
        System.out.println("Array length : " + numbers.length);

        //array soto theke boro
        Arrays.sort(numbers); 
        System.out.println("shorted array : " + Arrays.toString(numbers));
        

 
    }
}*/

//fibonacciseries
import java.util.*;
public class Array{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers?");
        int n=input.nextInt();
        int[] series = new int[n];
        series[0]=0;
        series[1]=1;
        for(int i=2;i<n;i++){
            series[i]=series[i-1]+series[i-2];
        }
        System.out.println("Heres the fibonacci seris ");
        for(int i=0;i<n;i++){
            //System.out.println("Fibonacci seris : " + series[i]);
            System.out.print(series[i]+" ");
        }
    }
}
