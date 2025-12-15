import java.util.*;

class person {
    String name;
    int age;
    person()
    {

    }
    person(String name,int age){
        this.name=name;
        this.age=age;
        
    }
    void setname(String name){
        this.name=name;
    }
    void setage(int age){
        this.age=age;
    }
    String getname(){
        return name;
    }
    int getage(){
        return age;
    }
}

class Doctor extends person{
    String workingid;
    String specialization;
    Doctor(){}
    Doctor(String name,int age,String workingid,String specialization){
      super(name,age);
      this.specialization=specialization;
      this.workingid=workingid;

    }
    void setworkingid(String workingid){
        this.workingid=workingid;
    }
    void setspecialization(String specialization){
        this.specialization=specialization;
    }
    String getworkingid(){
        return workingid;
    }
    String getspecialization(){
        return specialization;
    }

    void showinfo(){
        System.out.println("Name : "+name);
        System.out.println("Age: "+age);
        System.out.println("Working id : "+workingid);
        System.out.println("Designation : "+ specialization);
    }

}
 public class inheritance{
public static void main(String[] args) {
    Doctor a1=new Doctor("muin",23,"25-5675","Sexologist");
    a1.showinfo();
    Doctor a2=new Doctor();
    a2.name="sujon";
    a2.age=21;
    a2.workingid="25-62083-2";
    a2.specialization="senior sexologist";
    a2.showinfo();

}
 }