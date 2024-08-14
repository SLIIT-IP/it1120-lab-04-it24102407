import java.util.Scanner;
public class IT24102407Lab4Q1
{
  public static void main(String[]args)
  {
  Scanner input = new Scanner(System.in);
  int number;
  
 System.out.print("Enter the number:");
 number=input.nextInt();
 
 if (number>0)
 {
 System.out.print("the number is positive:");
 }
 else if(number<0)
 {
 System.out.print("the number is Negative:");
 }
 else
 {
 System.out.print("the number is zero:");
  }
 }
}