

public class Date implements ticker {
        private int day;
        private int month;
        private int year;
           
       //Fully parametrized constructor
       public Date(int day,int month,int year){
           setDay(day);
           setMonth(month);
           setYear(year);
       }    
      //Getters and setters
          public int getDay() {
              return day;
          }
      
          /**
           * @param day the day to set
           */
          public void setDay(int day) {
              if (day>0&&day<31)
              this.day = day;
          }
      
          /**
           * @return int return the month
           */
          public int getMonth() {
              return month;
          }
      
          /**
           * @param month the month to set
           */
          public void setMonth(int month) {
              if(month>0&&month<12)
              this.month = month;
          }
      
          /**
           * @return int return the year
           */
          public int getYear() {
              return year;
          }
      
          /**
           * @param year the year to set
           */
          public void setYear(int year) {
              
              this.year = year;
          }
          public void tick(){
              if(this.day==30){
                if(this.month==12){
                setDay(1);
                setMonth(1);
                this.year++;
                }
                else{
                    setDay(1);
                    this.month++;
                }
            }
            else 
             this.day++;
          }
          public String toString(){
            System.out.println("----DATE----");
              return String.format("%d:%d:%d",getDay(),getMonth(),getYear());
          }
      
      
    }
      