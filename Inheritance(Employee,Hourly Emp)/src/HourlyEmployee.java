public class HourlyEmployee extends Employee {
     private int totalhours;
     private double hourlyIncome;
    

    /**
     * @return int return the totalhours
     */
    public int getTotalhours() {
        return totalhours;
    }

    /**
     * @param totalhours the totalhours to set
     */
    public void setTotalhours(int totalhours) {
        this.totalhours = totalhours;
    }

    /**
     * @return double return the hourlyIncome
     */
    public double getHourlyIncome() {
        return hourlyIncome;
    }

    /**
     * @param hourlyIncome the hourlyIncome to set
     */
    public void setHourlyIncome(double hourlyIncome) {
        this.hourlyIncome = hourlyIncome;
    }

    public HourlyEmployee(String name,int id,int totalhours, double hourlyIncome) {
        super(name,id);
        setHourlyIncome(hourlyIncome);
        setTotalhours(totalhours);
    }
    public String toString(){
        return String.format(" %s hourly income %f  hours %d",super.toString(),this.hourlyIncome,this.totalhours);
    }
    
}
