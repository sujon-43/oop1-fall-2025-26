import java.util.*;
public class Switchcase {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number (1-7) to get the corresponding day of the week:");
        int day=input.nextInt();
        String dayname;
        switch (day) {
            case 1:
            dayname = "satarday";
            break;
            case 2:
            dayname = "sunday";
            case 3:
            dayname = "monday";
            break;
            case 4:
            dayname = "tuesday";
            case 5:
            dayname = "wednesday";
            break;
            case 6:
            dayname = "thursday";
            case 7:
            dayname = "Friday";
            break;
            default:
                throw new AssertionError();
        }
        System.out.println("Day "+day+" is "+dayname);
    }
}
