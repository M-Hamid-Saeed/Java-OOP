import java.util.Scanner;
public class finalKeyword{
  public static void main(String[] args) {
    final int myNum = 15;
    System.out.println("Please Enter a  number");
    Scanner obj=new Scanner(System.in);
    int mynum = obj.nextInt();
    // will generate an error
    System.out.println(myNum);
  }
}