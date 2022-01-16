public abstract class Employee {
    
        protected String name;
         protected int id;
         

         //Default COnstructor;
         public Employee(){
             System.out.println("No arg constructor of Employee");
         }
        // //Argument constructor
         public Employee(String name,int id){
             this.name=name;
             if(id>0)
                 this.id=id;
             
         }
         //tostring
         public String toString(){
             return String.format("Employee: %s (ID: %d)",this.name,this.id);
         }
 }
