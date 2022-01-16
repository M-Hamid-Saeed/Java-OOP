import java.util.Scanner;
import java.time.LocalDate;

public class Test{

public static void main(String[] args) {
    //FOr Circle 
     System.out.println("Please Enter Radius of the Circle");
    Scanner obj= new Scanner(System.in);
    double rad=obj.nextDouble();
    circle c1= new circle(rad);
    double ans= c1.Area();
    double ans2=c1.perimeter();
    System.out.println("Radius of the circle is --> "+ ans+ " "+"\nPerimeter is--> "+ans2);
   //For Employee Class
    Scanner obj1=new Scanner(System.in);
    System.out.println("ENter Name of Employee-->");
    String name=obj1.nextLine();
    System.out.println("ENter Cnic of Employee-->");
    long cnic=obj1.nextLong();
    System.out.println("ENter Salary of Employee-->");
    double salary=obj1.nextDouble();
    // No ardument 
    Employee emp1=new Employee();
    //cnic and name as argument

    Employee emp2=new Employee(cnic,name);
    
    //FUlly parametrized COnstructor
    Employee emp3=new Employee(3123232,"Ali",323.33);
    //emp1.setCnic(cnic);
    System.out.println( "Emp 2-->\n"+emp2.getName()+ " "+emp2.getCnic());
    System.out.println( "Emp 3-->\n"+emp3.getName()+ " "+emp3.getCnic()+ "  "+emp3.getSalary() );
  
//Bank Account 
 Account Acc1=new Account(1);
 Account Acc2=new Account(23444,"Hamid ",23);



 if(Acc2.getAge()>35){
  Acc2.deposit(0);
}
 else if(Acc2.getAge()>=20&&Acc2.getAge()<=25)
{
  Acc2.deposit(50000);
}
else if(Acc2.getAge()>=25&&Acc2.getAge()<=30)
{
  Acc2.deposit(25000);
}
else if(Acc2.getAge()>=30&&Acc2.getAge()<=35)
{
  Acc2.deposit(10000);
}
else if(Acc2.getAge()<=20)
{
  System.out.println(". Your Age must be above 20 to create bank Account");
}


System.out.println("BALANCE -->: " + Acc2.getBalance());


//Person class
    
 Customer p1= new Customer("Hamid Saeed",20);
    Customer p2= new Customer("Hamid Saeed",LocalDate.of(2003,5,3));
    p2.setHeight(105);
    p2.setWeight(60);
    System.out.printf("BMI of %s is %.2f\n", p2.getName(), p2.getBMI());
    p2.getBMIHelp();
}
}