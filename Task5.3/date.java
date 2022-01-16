public class date {
  private int day;
  private int month;
  private int year;
     
 //Fully parametrized constructor
 public date(int day,int month,int year){
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
        if(year>2000&&year<2021)
        this.year = year;
    }
    public String toString(){
        return String.format("%d/%d/%d",getDay(),getMonth(),getYear());
    }


}
