package B01Advanced;

/**
 * @author Stephen
 * Inheritance-the is-a relationship
 * Class hierarchies
 * Superclasses, subclasses and their relationships
 * Keyword extends for the specifying inheritance
 * Access modifier protected in a superclass
 * Keyword super for accessing superclass members
 * Constructors and inheritance hierarchies
 * Methods of a class Object
 * Ctrl Shift r - rectangle selection
 */
public class CommissionEmployee extends Object
{

   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;
   private double grossSales; // gross weekly sales
   private double commissionRate; // commisssion percentage

   // five-argument constructor
   public CommissionEmployee(String firstName, String lastName,
           String socialSecurityNumber, double grossSales,
           double commissionRate)
   {
      // implicit call to Object's default consructor occurs here

      // if grossSales is invalid throw exceptio
      if (grossSales < 0.0)
      {
         throw new IllegalArgumentException(
                 "Gross Sales must be >= 0.0");
      }     

      // comissionRate is invalid throw exception
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
      {
         throw new IllegalArgumentException(
                 "Commission rate must be > 0.0 and < 1.0");
      }

      this.firstName = firstName;
      this.lastName = lastName;
      this.socialSecurityNumber = socialSecurityNumber;
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } // end constructor

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

   // set gross sales amount
   public void setGrossSales(double grossSales)
   {
      if(grossSales < 0.0)
      {
         throw new IllegalArgumentException(
         "Gross sales must be >= 0.0");
      }
      this.grossSales = grossSales;
   }
   
   // return gross sales amount
   public double getGrossSales()
   {
      return grossSales;
   }
   
   // set the commission rate
   public void setCommissionRate(double commissionRate)
   {
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
      {
         throw new IllegalArgumentException(
         "Commisssion rate must be > 0.0 and < 1.0");
      }      
      this.commissionRate = commissionRate;
   }
   
   // get commission rate
   public double getCommissionRate()
   {
      return commissionRate;
   }
   
   // calculate earnings
   public double earnings()
   {
      return getCommissionRate() * getGrossSales();
   }
   
   // return String representation of CommissionEmployee object
   @Override // indicates that this method overrides a superclass method
   public String toString()
   {
      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
              "commission employee", getFirstName(), getLastName(),
              "social security number", getSocialSecurityNumber(),
              "gross sales", getGrossSales(),
              "commission rate", getCommissionRate());
   }
} // end class CommissonEmployee
