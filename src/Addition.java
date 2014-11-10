/**
 *
 * @author Stephen
 */
import java.util.Scanner;

public class Addition {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int number1; // first number
      int number2; // second number
      int sum; // Add first & second number

      System.out.print("Enter first int: ");
      number1 = input.nextInt();

      System.out.print("Enter second int: ");
      number2 = input.nextInt();

      if (number1 == number2) {
         System.out.printf("%d == %d%n", number1, number2);
      }
      if (number1 != number2) {
         System.out.printf("%d != %d%n", number1, number2);
      }
      if (number1 < number2) {
         System.out.printf("%d < %d%n", number1, number2);
      }
      if (number1 > number2) {
         System.out.printf("%d > %d%n", number1, number2);
      }
      if (number1 <= number2) {
         System.out.printf("%d <= %d%n", number1, number2);
      }
      if (number1 >= number2) {
         System.out.printf("%d == %d%n", number1, number2);
      }
      // sum = number1 + number2;

      // System.out.printf("Sum is %d%n", sum);

   }

}
