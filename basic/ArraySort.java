package basic;

/**
 * @author Stephen
 */
import java.util.Arrays;

public class ArraySort
{

   /* Basic Sorting Array */
   public static void main(String[] args)
   {

      // Array of numbers, length = n -1
      int[] numbers =
      {
         50, 25, 15, 14, 5, 35, 10, 4
      };
      System.out.print("Unsorted Array: ");
      for (int i : numbers)
      {
         System.out.print(i + " ");
      }

      for (int i = 0; i < numbers.length; i++)
      {
         int smallOrBigNum = numbers[i]; // Assign smallOrBigNum to Array
         int index = i; // Assign index to i
         int posOfSmallest = index; // Position of the smallest number

			// Nested for loop - step through numbers array
         // checks all the positions in the array between
         // position i and the end of the array and finds which one is
         // smallest number
         for (int j = index; j < numbers.length; j++)
         {

            // Assign value to j
            int value = numbers[j];

            // If value greater or less than smallOrBigNum
            if (value > smallOrBigNum)
            {

               // Assign value to smallOrBigNum
               smallOrBigNum = value;

               // Change the position of J if smaller number found
               posOfSmallest = j;
            }

         }

         // Temp to hold i so as not to overwrite i
         int temp = numbers[i];

         // Swap numbers[i] and numbers[posOfSmallest] with temp
         numbers[i] = smallOrBigNum;
         numbers[posOfSmallest] = temp;

      }

      // Print to console sorted array
      System.out.println("\nSorted Array: " + Arrays.toString(numbers));

   }

   public static void InsertSort()
   {

   }

}
