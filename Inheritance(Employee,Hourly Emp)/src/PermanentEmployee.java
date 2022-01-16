public class PermanentEmployee extends Employee {
    private double hourlyIncome;
    // //3 argument Constructor while the name and id are inherited
    public PermanentEmployee(String name,int id,double hourlyincome ){
        super(name, id);
        this.hourlyIncome=hourlyincome;   
     }
     public double show(){
         return hourlyIncome*hourlyIncome;
     }
     public String toString(){
        return String.format(" %s hourly income %f",super.toString(),this.hourlyIncome);
    }
    public static void main(String[] args) {
        Employee[] e=new Employee[3];
        e[0]=new PermanentEmployee("Hamid",1,2300);
        e[1]=new HourlyEmployee("Rehan",23,123,234300);
        e[2]=new HourlyEmployee("Tamor",34,1343,24560);
        for(Employee emp: e ){
        
            
            System.out.println(emp.toString());
         
         }

        } 

    }


