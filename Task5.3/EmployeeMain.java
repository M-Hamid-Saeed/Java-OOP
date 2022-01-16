

public class EmployeeMain {
   public static void main(String[] args) {
       Employee emp[]=new Employee[3];
       emp[0]= new Employee(1,"Hamid Saeed",new date(1,1,2020),new date(10,8,2003));
       emp[1]= new Employee(2,"Rehan Khan",new date(3,5,2020),new date(4,3,2003));
       emp[2]= new Employee(3,"Ahmad Anwar",new date(4,4,2020),new date(4,3,2003));
       for(Employee e: emp){
         System.out.println(e);
         System.out.println("===========");
       }
   } 
}
