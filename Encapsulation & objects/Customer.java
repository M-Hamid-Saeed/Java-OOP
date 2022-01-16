
    import java.time.LocalDate;
    public class Customer{
       LocalDate dob; 
        private String name;
        private double height;
        private double weight;
        private int age;
        
        public void setName( String name){
          this.name =name;
        }
        
        public String getName(){
          return name;
        }
        
        public void setHeight(double height){
          if(height>0){
            this.height=height;
          }
        }
        
        public double getHeight(){
          return height;
        }
        
        public void setWeight(int weight){
          if(weight>0){
            this.weight=weight;
          }
          
        }
        
        public double getWeight(){
          return weight;
          
        }
        
        public void setAge(int age){
          if(age>0){
            this.age=age;
          }
        }
        
        
        
        public Customer(String name , int age){
          setName(name);
          setAge(age);
           if(age > 0)
               dob = LocalDate.now().minusYears(age);
          
        }
        
         public Customer(String name, LocalDate dob){
            setName(name);
            this.dob = dob;
        }
         
         public int getAge(){
            LocalDate today = LocalDate.now(); 
            int todayYear = today.getYear();   
            int yearYouBorn = dob.getYear();
            return todayYear - yearYouBorn; 
        }
         
          public double getBMI(){
            
            if(getHeight() != 0 && getWeight() != 0)
                return getWeight() / getHeight() / getHeight() * 10000;
            else {
                System.out.println("Weight and Height not provided");
                return -1;
            }   
        }
          
           public void getBMIHelp(){
            System.out.println("Underweight =< 18.5\nNormal Weight = 18.5 - 24.9\nOverweight = 25 - 29.9\nObesity >= 30");
        }
     
    } 
     

