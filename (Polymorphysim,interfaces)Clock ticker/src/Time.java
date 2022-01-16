

public class Time implements ticker {
    private int hour;
    private int seconds;
    private int minutes;
    
    

    /**
     * @return int return the hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * @param hour the hour to set
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * @return int return the seconds
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * @param seconds the seconds to set
     */
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    /**
     * @return int return the minutes
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * @param minutes the minutes to set
     */
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    //Constructor
    public Time(int hour,int minutes,int seconds){
        setHour(hour);
        setMinutes(minutes);
        setSeconds(seconds);
    }
    @Override
    public void tick(){
        if(seconds==59){
            if(minutes==59){
                if(hour==23){
                    this.hour=0;
                    this.minutes=0;
                    this.seconds=0;
                }
                else{
                   this.hour++;
                   this.minutes=0;
                   this.seconds=0;
                }
            }
            else{ 
              this.minutes++;
              this.seconds=0;
            }
        }
        else
        this.seconds++;
    }
    public String toString(){
        System.out.println("----TIME---");
        return String.format("%d:%d:%d",getHour(),getMinutes(),getSeconds());
    }

}