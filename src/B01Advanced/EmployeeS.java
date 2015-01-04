package B01Advanced;

/**
 * @author Stephen Employees Static variable used to maintain a count of the
 * number of Employee objects in memory
 */
public class EmployeeS
{

   private static int count = 0;
   private String firstName; // reference type instance 
   private String lastName; // reference to an object

   // initialise Employee, add 1 to static count and
   // output String indicating that constructor was called
   public EmployeeS(String firstname, String lastname)
   {
      this.firstName = firstname;
      this.lastName = lastname;

      ++count; // increment static count of employees
      System.out.printf("Employee constructor: %s %s; count = %d%n",
              firstName, lastName, count);
   }

  public String getFirstName() 
  {
     return firstName;
  }
  
  public String getLastName() 
  {
     return lastName;
  }
  
  public static int getCount() 
  {
     return count;
  }
} // end class Employees

