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
 * BasePlusCommissionEmployee class represents an employee that receives
 * a base salary in addition to commission
 * inheritance allows you to rapidly create new classes by
 * basing them on preexisting classes
 *
 */
public class BasePlusCommissionEmployee extends CommissionEmployee
{

   private double baseSalary; // base salary per week

   // six-argument constructor
   public BasePlusCommissionEmployee(String firstName, String lastName,
           String socialSecurityNumber, double grossSales,
           double commissionRate, double baseSalary)
   {
      // explicit call to CommissionEmployee constructor occurs here
      super(firstName, lastName, socialSecurityNumber,
              grossSales, commissionRate);      

      // if baseSalary is invalid throw exception
      if(baseSalary < 0.0)
      {
         throw new IllegalArgumentException(
         "Base salary must be >= 0.0");
      }

      this.baseSalary = baseSalary;
   } // end constructor

   // set base salary
   public void setBaseSalary(double baseSalary)
   {
      if(baseSalary < 0.0)
      {
         throw new IllegalArgumentException(
         "Base salary must be >= 0.0");
      }
      
      this.baseSalary = baseSalary;
   }
   
   // return base salary
   public double getBaseSalary()
   {
      return baseSalary;
   }
   
   // calculate earnings
   @Override
   public double earnings()
   {
      return baseSalary + (commissionRate * grossSales);
   }
   
   // return String representation of BasePlusCommissionEmployee object
   @Override // indicates that this method overrides a superclass method
   public String toString()
   {
      return String.format(
              "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
              "base-salaried commission employee", firstName, lastName,
              "social security number", socialSecurityNumber,
              "gross sales", grossSales, "commission rate", commissionRate,
              "base salary", baseSalary);
   }
} // end class BasePlusCommissonEmployee
