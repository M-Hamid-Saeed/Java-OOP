public class Account {
        private int accId;
        private int cnic;
        private String name;
        private int age;
        private float balance;
        
        public void setAccId(int accId){
          if(accId>0){
          this.accId=accId;
          }
        }
        
        public int getAccId(){
          return accId;
        }
        
        public void setCnic(int cnic){
          this.cnic=cnic;
        }
        
        public int getCnic(){
        return cnic;
        }
        
        public void setName(String name){
          this.name=name;
        }
        
        public String getName(){
          return name;
        }
        
        public void setAge(int age){
          
          if (age>0){
            this.age=age;
          }
        }
        
        public int getAge(){
        return age;
        }
        
        public void deposit(float balance){
          this.balance+=balance;
        }
        
        public void withdraw(float balance){
          this.balance-=balance;
        }
        
        public float getBalance(){
          return balance;
        }
        
        public Account(int accId){
          setAccId(1);
        }
        
        public Account(int cnic,String name,int age){
          setCnic(cnic);
          setName(name);
          setAge(age);
        }
 }
        
