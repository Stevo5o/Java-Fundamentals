package A00Basic;

/**
 *
 * @author Stephen
 */
import java.util.Scanner;

public class Addition
{

   public static void main(String[] args)
   {

      Scanner input = new Scanner(System.in);

      int number1; // first number
      int number2; // second number
      int sum; // sum of first & second number

      // Enter numbers 
      System.out.print("Enter first int: ");
      number1 = input.nextInt();

      System.out.print("Enter second int: ");
      number2 = input.nextInt();

      // check numbers 
      if (number1 == number2)
      {
         System.out.printf("%d == %d%n", number1, number2);
      }
      if (number1 != number2)
      {
         System.out.printf("%d != %d%n", number1, number2);
      }
      if (number1 < number2)
      {
         System.out.printf("%d < %d%n", number1, number2);
      }
      if (number1 > number2)
      {
         System.out.printf("%d > %d%n", number1, number2);
      }
      if (number1 <= number2)
      {
         System.out.printf("%d <= %d%n", number1, number2);
      }
      if (number1 >= number2)
      {
         System.out.printf("%d == %d%n", number1, number2);
      }

      // add number1 to number 2
      sum = number1 + number2;

      System.out.printf("Sum is %d%n", sum);

   }

}
