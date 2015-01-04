package B01Advanced;

/**
 * @author Stephen
 */
public class Time2
{
   private int hour;      // 0- 23
   private int minute;    // 0 - 59
   private int second;    // 0 - 59

   // Time2 no-argument constructor
   // initializes each 
   public Time2()
   {
      this(0, 0, 0); // invoke constructor with three arguments
   }

   // Time2 constructor: hour supplied, minute and second defaulted to 0
   public Time2(int hour)
   {
      this(hour, 0, 0); // invoke 
   }

   public Time2(int hour, int minute)
   {
      this(hour, minute, 0);
   }

   // Time2 constructor: hour, minute secod supplied
   public Time2(int hour, int minute, int second)
   {
      if (hour < 0 || hour >= 24)
      {
         throw new IllegalArgumentException("hour must be 0-23");
      }

      if (minute < 0 || minute >= 60)
      {
         throw new IllegalArgumentException("minute must be 0-59");
      }

      if (second < 0 || second >= 60)
      {
         throw new IllegalArgumentException("second must be 0-59");
      }
      
      this.hour = hour;
      this.minute = minute;
      this.second = second;
   }

   public Time2(Time2 time)
  {
         // invoke constructor with three arguments
     this(time.getHour(), time.getMinute(), time.getSecond());
  }
   
   // validate and set hour
   public void setHour(int hour)
   {
      if(hour < 0 || hour >= 60) {
         throw new IllegalArgumentException("minute must be 0-59");
      }
      
      this.hour = hour;
   }
   
   // validate and set minute
   public void setMinute(int minute)
   {
      if(minute < 0 || minute >= 60) {
         throw new IllegalArgumentException("minute must be 0-59");
      }
      
      this.minute = minute;
   }
   
   // validate and set second
   public void setSecond(int second)
   {
      if(second < 0 || second >= 60) {
         throw new IllegalArgumentException("minute must be 0-59");
      }
      
      this.second = second;
   }
   
   // Get methods
   // get hour value
   public int getHour()
   {
      return hour;
   }
   
   // get hour value
   public int getMinute()
   {
      return minute;
   }
   
   // get hour value
   public int getSecond()
   {
      return second;
   }
   
   // covet to String in universal-time format (HH:MM:SS AM or PM)
   public String toUniversalString()
   {
      return String.format(
              "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
   }
   
   // convert to String in the a standard-time format (H:MM:SS)
   public String toString()
   {
      return String.format("%d:%02d:%02d %s",
              ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
              getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
   }
}
