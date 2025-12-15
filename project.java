
class contact{
   private String email; 
   private String phone;

   public contact(String email,String phone){
    this.email=email;
    this.phone=phone;
   }

   public void Showcontact(){
    System.out.println("Email: "+email);
    System.out.println("Number : "+phone);
   }
}

class student{
    private String name;
    private contact contact;
    public student(String name, contact contact){
        this.name=name;
        this.contact=contact;
    }
public void showstudent(){
 System.out.println("Stdent name : "+ name);
 contact.Showcontact();
}

}


class schooldetails{
    private String scname;
    private student[] students;
    private int count=0;

    public schooldetails(String scname,int count){
        this.scname=scname;
        students=new student[count];
    
    }
    public void addstudent(student student){
        if(count<students.length){
            students[count++]=student;

        }
    }

    public void showschool(){
        System.out.println("School name : " + scname);
        for(int i=0;i<count;i++){
            students[i].showstudent();

            System.out.println("-------------------");
            System.out.println();
        }
    }


}
public class project{
public static void main(String[] args) {
   contact c1 = new contact("amssujon3@gmail.com","01734655628");
   contact c2 = new contact("muimuin45@gmail.com","01736474658");

   student s1 = new student("Sujon",c1 );
   student s2 = new student("muin", c2);

   schooldetails sc1= new schooldetails("Police lines school and collage", 10);
   sc1.addstudent(s1);
   sc1.addstudent(s2);
   sc1.showschool();
}
}
