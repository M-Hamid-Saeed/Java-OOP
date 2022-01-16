import java.util.Scanner;

public class circle {
    private double radius;
    public circle(double rad)
    {
        this.radius=rad;

    }
    public void setRadius(double radius)
    {
        if(radius>0)
            this.radius=radius;

    }
    public double getradius()
    {  
        return this.radius;
    }
    public double Area()
    {
        return 3.14*this.radius*this.radius;
    }
    public double perimeter()
    {
        return 2*this.radius*this.radius;

    }
}
