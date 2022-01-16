package Task5;

public class Main {
    public static void main(String[] args) {
        Address add=new Address("Lahore","Bahria town","Pakistan");
        Student std1=new Student("Hamid Saeed",31203,add,new PhoneNumber(1232,3232,3232));
        
        std1.setcourse1("OOP"); 
        std1.setcourse2("DLD");
        
        Student std2=new Student("Hamid Saeed",31203,add,new PhoneNumber(1232,3232,3232));
        
        std2.setcourse1("OOP2");
        std2.setcourse2("DLD2");
        
        System.out.println(std1.getName()+"     "+std1.getCNIC()+" "+std1.getaddress()+"  "+std1.getcourse1()+" "+std1.getcourse2());
        System.out.println(std2.getName()+"     "+std2.getCNIC()+" "+std2.getaddress()+"  "+std2.getcourse1()+" "+std2.getcourse2());
    }
}
