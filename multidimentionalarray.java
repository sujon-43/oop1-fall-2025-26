import java.util.*;
public class multidimentionalarray {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[][] numbers=new int[3][3];
    System.out.println("Enter 3X3 matrix : ");
    for(int i=0; i<3;i++){
        for(int j=0; j<3;j++){
            numbers[i][j]=input.nextInt();
        }
    }
    System.out.println("The matrix is "+Arrays.deepToString(numbers ));
   }
}

