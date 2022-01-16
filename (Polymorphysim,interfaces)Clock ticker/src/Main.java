

public class Main {
    public static void main(String[] args) {
        ticker[] ticks=new ticker[2];
        ticks[0]=new Date(30,12,21);
        ticks[1]=new Time(23,59, 59);
        for(ticker ticking:ticks){
            ticking.tick();
            System.out.println(ticking);
        }
    }
    
}