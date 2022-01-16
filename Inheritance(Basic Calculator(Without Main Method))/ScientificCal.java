import java.lang.Math;
public class ScientificCal extends BasicCal{
    protected int num3;
     public ScientificCal(int num1,int num2,int num3){
         super(num1,num2);
         this.num3=num3;
     }
     public int sum(int num1,int num2,int num3)
     {
         return super.sum( num1,num2)+num3;
     }
     public int subtraction(int num1,int num2,int num3)
     {
         return sub(num1,num2)-num3;
     }
     public double cosine(int num1)
     {
         return Math.cos(num1);
     }
     public double sine(int num1)
     {
         return (double)Math.sin(num1);
     }
     public double tangent(int num1)
     {
         return (double)Math.tan(num1);
     }
     

    
}
