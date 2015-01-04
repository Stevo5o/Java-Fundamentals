package B01Advanced;

/**
 * @author Stephen 
 * Employee class with references to other objects
 */
public class Employee
{

   private String firstName; // reference type instance 
   private String lastName; // reference to an object
   private Date birthDate;
   private Date hireDate;

   // constructor to intialise name, birth date and hire date
   public Employee(String firstname, String lastname, Date birthDate,
           Date hireDate)
   {
      this.firstName = firstname;
      this.lastName = lastname;
      this.birthDate = birthDate;
      this.hireDate = hireDate;
   }

   // convert Employee to String format
   public String toString()
   {
      return String.format("%s, %s Hired: %s Birthday: %s",
              lastName, firstName, hireDate, birthDate);
   }
} // end class Employee
