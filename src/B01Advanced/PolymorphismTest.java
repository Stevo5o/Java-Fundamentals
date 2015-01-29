package B01Advanced;

/**
 * @author Stephen
 * Polymorphism concepts
 * Use overridden methods to effect polymorphism
 * Abstract vs. concrete classes
 * How polymorphism makes systems extensible & maintainable
 * instanceof operator
 * Declare & implement interfaces
 * Java SE 8 interface enhancements
 * Assigning superclass
 */
public class PolymorphismTest
{

   public static void main( String[] args )
   {

      // assign superclass reference to superclass var
      CommissionEmployee commissionEmployee = new CommissionEmployee(
              "SteJ", "O'Connor", "222-13-2222", 10000, .06 );

      // assign subclass reference to subclass var
      BasePlusCommissionEmployee basePlusCommissionEmployee
              = new BasePlusCommissionEmployee(
                      "Bob", "Lewis", "333-33-3333", 5000, .04, 300 );

      // invoke toString on supercalss object using superclass variable
      System.out.printf( "%s %s:%n%n%s%n%n",
              "Call CommissionEmployee's toString with superclass reference ",
              "to superclass object", commissionEmployee.toString() );

      // invoke toString on subclass object using subclass var
      System.out.printf( "%s %s:%n%n%s%n%n",
              "Call BasePlusCommissionEmployee's toString with subclass",
              "reference to subclass object",
              basePlusCommissionEmployee.toString() );

      // invoke toString on subclass object using superclass var
      CommissionEmployee commissionEmployee2
              = basePlusCommissionEmployee;
      System.out.printf( "%s %s:%n%n%s%n",
              "Call BasePlusCommissionEmployee's toString with superclass",
              "reference to subclass object", commissionEmployee2.toString() );
   }
}
