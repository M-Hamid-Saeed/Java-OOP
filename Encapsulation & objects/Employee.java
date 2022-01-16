public class Employee{
private long cnic;
private String name;
private double salary;


public void setName(String naam)
{
    this.name=naam;
}
public String getName()
{
   return this.name;
}
public void setSalary(double salary)
{
    if(salary>0)
 this.salary=salary;
}
public double getSalary()
{
   return this.salary;
}
public void setCnic(long cnic)
{
 this.cnic=cnic;
}
public long getCnic()
{
   return this.cnic;
}
//****Defining Constructors******
//No Argument COnstructor
public Employee()
{
    System.out.println("No arguments constructor called");
}
//2 paramters Constructor
public Employee (long cnic,String name)
{
 setCnic(cnic);
setName(name);
}
//Fully parametrized constructor
public Employee (long cnic,String name,double salary)
{
this(cnic, name); //calling 2nd constructor 
this.salary=salary;
}
}
