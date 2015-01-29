package B01Advanced;

/**
 * @author Stephen 
 * Employee class with references to other objects
 */
public abstract class EmployeePayroll
{

   private final String firstName; // reference type instance 
   private final String lastName; // reference to an object
   private final String socialSecurityNumber;   

   // constructor to intialise firstName, lastName & socialSecurityNumber
   public EmployeePayroll(String firstname, String lastName, String socialSecurityNumber)
   {
      this.firstName = firstname;
      this.lastName = lastName;
      this.socialSecurityNumber = socialSecurityNumber;      
   }
   
   // return first name
   public String getFirstName()
   {
      return firstName;
   }
   
   // return last name
   public String getLastName()
   {
      return lastName;
   }
   
   // return social security number   
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   }

   // return String representation of Employee object
   @Override
   public String toString()
   {
      return String.format("%s, %s%nsocial security number: %s",
              getFirstName(), getLastName(), getSocialSecurityNumber());
   }
   
   // abstract method must be overridden by concrete subclasses
   public abstract double earnings(); // no implementation here
} // end class Employee

