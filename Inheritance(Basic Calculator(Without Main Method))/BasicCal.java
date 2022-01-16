import java.util.Scanner;
public class BasicCal {
    protected int num1;
    protected int num2;

    /**
     * @return int return the num1
     */
    public int getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    /**
     * @return int return the num2
     */
    public int getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(int num2) {
       
        //constructor
    public BasicCal(int num1,int num2)
    {
        setNum1(num1);
        setNum2(num2);
    }
    public int sum(int num1,int num2)
    {
        return num1+num2;
    }
    public int sub(int num1,int num2)
    {
        return num1-num2;
    }
    public double div(int num1,int num2)
    {
        return (double)(num1/num2);
    }
    public int mul(int num1,int num2)
    {
        return num1*num2;
    }

}
