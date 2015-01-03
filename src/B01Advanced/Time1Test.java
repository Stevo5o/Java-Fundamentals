package B01Advanced;

/**
 * @author Stephen
 */
public class Time1Test
{

   public static void main(String[] args)
   {
      Time1 time = new Time1();    // invokes the Time1

      // output string reprenstaions
      displayTime("After time object is created", time);
      System.out.println();

      // change time and output updated time
      time.setTime(13, 27, 6);
      displayTime("After calling setTime", time);
      System.out.println();

      // attempt to set time with invalid values
      try
      {
         time.setTime(99, 99, 99);    // all values out of range
      } catch (IllegalArgumentException e)
      {
         System.out.printf("Exception: %s%n%n", e.getMessage());
      }

      // display time after attempt to set invalid values
      displayTime("After calling setTiem with invalid values", time);
   }

   // display a time1 object in 24-hour and 12-hour formats
   private static void displayTime(String header, Time1 t)
   {
      System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, t.toUniversalString(), t.toString());
   }
}
