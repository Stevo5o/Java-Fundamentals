package B01Advanced;

/**
 * @author Stephen
 * PayrollCommissionEmployee extends EmployeePayroll
 */
public class PayrollCommissionEmployee extends EmployeePayroll
{

   private double grossSales;
   private double commissionRate;
   

   // constructor
   public PayrollCommissionEmployee(String firstName, String lastName,
           String socialSecurityNumber, double grossSales,
           double commissionRate)
   {

      super(firstName, lastName, socialSecurityNumber);
      
      // if grossSales is invalid throw exceptio
      if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
      {
         throw new IllegalArgumentException(
                 "Gross Sales must be >= 0.0 and < 1.0");
      }     

      if (grossSales < 0.0) // validate
      {
         throw new IllegalArgumentException("Gross sales must be => 0.0");
      }

      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
      
   } // end constructor

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
   @Override
   public double earnings()
   {
      return getCommissionRate() * getGrossSales();
   }
   
   // return String representation of CommissionEmployee object
   @Override // indicates that this method overrides a superclass method
   public String toString()
   {
      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
              "commission employee", super.toString(),              
              "gross sales", getGrossSales(),
              "commission rate", getCommissionRate());
   }
} // end class CommissonEmployee
