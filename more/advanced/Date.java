package B01Advanced;

/**
 * @author Stephen. Date class declaration Composition A class can have
 * references to objects of other classes as members Called composition and is
 * sometimes referred to as a has-a relationship + e.g., a car has a steering
 * wheel, has a break pedal and has an accelerator pedal. Java's form of composition is
 * more formally called aggregation + Objects in Java are referenced by other
 * objects, not completely contained in them as in C++
 */

public class Date
{

   private int month; // 1-12
   private int day; // 1-31 based on month
   private int year; // any year

   private static final int[] daysPerMonth =
   {
      0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
   };

   // constructor: confirm proper value for month and day given the year
   public Date(int month, int day, int year)
   {
      // check if month in range
      if (month <= 0 || month > 12)
      {
         throw new IllegalArgumentException(
                 "month (" + month + ") mi=ust be 1-12");
      }

      // check if range for month 
      if (day <= 0
              || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
      {
         throw new IllegalArgumentException("day (" + day
                 + ") out-of-range for the specified month and year");
      }

      // check for leap year if month is 2 and day is 29
      if (month == 2 && day == 29 && !(year % 400 == 0
              || (year % 4 == 0 && year % 100 != 0)))
      {
         throw new IllegalArgumentException("day (" + day
                 + ") out-of-range for th especified month and year");
      }

      this.month = month;
      this.day = day;
      this.year = year;

      System.out.printf(
              "Date oject constructor for date %s%n", this);
   }

   // return a String of the form month/day/year
   public String toString()
   {
      return String.format("%d/%d/%d", month, day, year);
   }
}
