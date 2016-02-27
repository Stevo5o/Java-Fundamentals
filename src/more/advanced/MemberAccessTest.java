package B01Advanced;

/**
 * @author Stephen
 * Private members of class Time1 are not accessible.
 */
public class MemberAccessTest
{

   public static void main(String[] args)
   {
      Time1 time = new Time1();
      
      time.hour = 7; // error: hour has private access in time1
      time.minute = 15; // error: minute has private access in Time1
      time.minute = 30; // error: second has private access in Time1
   }
}
