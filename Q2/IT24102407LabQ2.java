import java.util.Scanner;

public class IT24102407LabQ2
 {

    public static void main(String[] args)
   {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();
        if (examMarks <0 || examMarks> 100) 
       {
            System.out.println("Invalid input for exam mark. Terminating program.");
            return;
        }

        
        System.out.print("Enter lab submission marks (out of 100): ");
        double labSubmission = scanner.nextDouble();
        if (labSubmission <0 || labSubmission> 100)
       {
            System.out.println("Invalid input for lab submission mark. Terminating program.");
            return;
        }

        
        System.out.print("Enter the percentage for exam marks: ");
        double examPercentage = scanner.nextDouble();

        System.out.print("Enter the percentage for lab submission marks: ");
        double labPercentage = scanner.nextDouble();

       
        if (examPercentage + labPercentage != 100) 
       {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }

        
        double finalMark = (examMarks * examPercentage / 100) + (labSubmission * labPercentage / 100);

        System.out.println("The final mark is: " + finalMark);

        
    }
}