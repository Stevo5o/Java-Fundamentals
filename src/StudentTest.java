//import java.util.Scanner;

/**
 * @author Stephen
 */
//public class StudentTest {
//
////   public static void main(String[] args) {
//
////      Student account1 = new Student("Jane Green", 93.5);
////      Student account2 = new Student("John blue", 72.75);
////
////      System.out.printf("%s's letter grade is: %s%n",
////              account1.getName(), account1.getLetterGrade());
////      System.out.printf("%s's letter grade is: %s%n",
////              account2.getName(), account2.getLetterGrade());
////      Scanner input = new Scanner(System.in);
////
////      int total = 0;
////      int gradeCounter = 0;
////
////      System.out.print("Enter grade or -1 to quit: ");
////      int grade = input.nextInt();
////
////      while (grade != -1) {
////
////         total = total + grade;
////         gradeCounter = gradeCounter + 1;
////
////         System.out.print("Enter grade or -1 to quit: ");
////         grade = input.nextInt();
////
////      }
////
////      if (gradeCounter != 0) {
////
////         double average = (double) total / gradeCounter;
////
////         System.out.printf("%nTotal of all %d grades is %d%n", gradeCounter, total);
////         System.out.printf("Class average is %.2f%n", average);
////      } else {
////         System.out.println("No grades were entered");
////      }
//      
////      int counter = 1;
////      
////      do {
////         System.out.printf("%d  ", counter);
////         ++counter;
////      } while (counter <= 10);
////      
////      System.out.println();
//      
//      int total = 0;
//      int gradeCounter = 0;
//      int aCount = 0;
//      int bCount = 0;
//      int cCount = 0;
//      int dCount = 0;
//      int fCount = 0;
//      
//      Scanner input = new Scanner(System.in);
//      
//      System.out.printf("%s%n%s%n   %s%n   %s%n",
//              "Enter the integer grades in the range 0-100.",
//              "Type the end-of-file indicator to terminate input:",
//              "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
//              "On Windows type <Ctrl> z then press Enter");
//      
//      while (input.hasNext()){
//         
//         int grade = input.nextInt();
//         total += grade;
//         ++gradeCounter;
//         
//         switch (grade / 10) {
//            case 9:
//            case 10:
//               ++aCount;
//               break;
//               
//            case 8:
//               ++bCount;
//               break;
//               
//            case 7:
//               ++cCount;
//               break;
//            
//            case 6:
//               ++bCount;
//               break;
//           
//            default:
//               ++fCount;
//               break;
//         }
//      }
//      
//
//   }
//}
