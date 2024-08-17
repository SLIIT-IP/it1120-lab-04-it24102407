import java.util.Scanner;

public class IT24102407LabQ3
{

    public static void main(String[] args)
  {

        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number:");
         int number= scanner.nextInt();
        
          String result= (number>0)?"positive":
                          (number<0)?"negetive":
                           "zero";                  
    System.out.println("the number is :"+ number);        
      
   }
}