import java.util.Scanner;

/**
 * Write a description of class Task2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Task2
{
     
  public static void main (String []args)
  {
      Scanner scanner= new Scanner(System.in);
      System.out.println("Enter the number of subject");
      int numSubjects= scanner.nextInt();
      
      int[] marks = new int[numSubjects];
      
      int totalMarks = 0;
      
      for(int i=0; i<numSubjects;i++ )
      { 
          System.out.println("Enetr marks for the subject"+ (i +1)+"(out of 100):");
          marks[i]= scanner.nextInt();
          totalMarks += marks[i];
        }
      double averagePercentage = (double)totalMarks/numSubjects;
      String grade;
      if(averagePercentage >=90)
      {
          grade = "A+";
        }
      else if (averagePercentage >=80)
      { 
          grade = "A";
        }
      else if(averagePercentage >=70)
      { 
          grade = "B";
          
        }
      else if (averagePercentage >=60)
      {
          
          grade = "C";
      }
      else if (averagePercentage >=50)
      {
          grade = "D";
        }
      else
      {
          grade =" F";
          
        }
     System.out.println("\n---- Results -----");
     System.out.println("Total Marks:"+totalMarks + "out of" +(numSubjects *100));
     System.out.println("Average Percentage:"+String.format("%.2f",averagePercentage)+"%");
     System.out.println("Grade"+grade);
     
     scanner.close();
      
      
      
    }
}
