package B01Advanced;

/**
 * @author Stephen
 * SalariedEmployee concrete class extends abstract class Employee.
 */
public class HourlyEmployee extends EmployeePayroll
{

   private double wage;
   private double hours;

   // constructor
   public HourlyEmployee( String firstName, String lastName,
           String socialSecurityNumber, double wage, double hours )
   {
      super( firstName, lastName, socialSecurityNumber );

      if ( wage < 0.0 )
      {
         throw new IllegalArgumentException(
                 "Weekly salary must be >= 0.0" );
      }

      if ( ( hours < 0.0 ) || ( hours > 168.0 ) ) // valisdte         
      {
         throw new IllegalArgumentException(
                 "Weekly salary must be >= 0.0 and <= 168.0" );
      }

      this.wage = wage;
      this.hours = hours;
   }

   // set salary
   public void setWage( double wage )
   {
      if ( wage < 0.0 ) // validate
      {
         throw new IllegalArgumentException(
                 "Weekly salary must be >= 0.0" );
      }

      this.wage = wage;
   }

   // return salary
   public double getWage()
   {
      return wage;
   }

   // set hours worked
   public void setHours( double hours )
   {
      if ( ( hours < 0.0 ) || ( hours > 168.0 ) ) // valiadte         
      {
         throw new IllegalArgumentException(
                 "Weekly salary must be >= 0.0 and <= 168.0" );
      }

      this.hours = hours;
   }
   
    // return salary
   public double getHours()
   {
      return hours;
   }

   // calculate earnings; override abstract method earnings in Employee Payroll
   @Override
   public double earnings()
   {
      if(getHours() <= 40)
      {
         return getWage() * getHours();
      }
      else
      {
         return 40 * getWage() + (getHours() - 40 ) * getWage() * 1.5;
      }
   }

   // return String repreentation of SalariedEmployee object
   @Override
   public String toString()
   {
      return String.format( "hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
              super.toString(), "hourly salary", getWage(),
              "hours worked", getHours());
   }
} // end class SalariedEmployee
