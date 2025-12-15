import java.util.*;
//import java.text.NumberFormat;
class inheritance{
   
    private int age;
    private String name;
public inheritance(String name,int age){
    this.name = name;
        
        this.age = age;
}
public void display(){
    System.out.println("Your name is : "+name);
    //System.out.println("Your mobile number  : "+number);
    System.out.println("Your id : "+age);

}
}

public class FormattedNumber {
    public static void main(String[] args) {
        
    inheritance[] student;
    student = new inheritance[5];
    student[0]=new inheritance("muin",25);
    student[1]=new inheritance("rakib",35);
    student[2]=new inheritance("tufan",45);
    student[3]=new inheritance("nasim",78);
    student[4]=new inheritance("mim",44);
    for(int i=0;i<student.length;i++){
        student[i].display();
    }
    
    }





}
