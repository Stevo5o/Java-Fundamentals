package B01Advanced;

/**
 * @author Stephen
 */
public class ThisTest
{

   public static void main(String[] args)
   {
      SimpleTime time = new SimpleTime(15, 30, 19);
      System.out.println(time.buildString());
   }
} // end ThisTest class

// class SimpleTime 
class SimpleTime
{

   private int hour; // 0- 23
   private int minute; // 0- 23
   private int second; // 0- 23

   public SimpleTime(int hour, int minute, int second)
   {
      this.hour = hour; // set "this" objects hour
      this.minute = minute; // set "this" objects hour
      this.second = second; // set "this" objects hour
   }

   // use explicit and implicit "this" to call toUniversalString
   public String buildString()
   {
      return String.format("%24s: %s%n%24s: %s",
              "this.toUniversalString()", this.toUniversalString(),
              "toUnersalString()", toUniversalString());
   }

   public String toUniversalString()
   {

      // "this" is not required here to access instance vars
      // because method does not have local vars with same
      // nams as instance vars
      return String.format("%02d:%02d:%02d",
              this.hour, this.minute, this.second);
   }
} // end class SimpleTie
