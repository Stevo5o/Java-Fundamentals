package B01Advanced;

/**
 * @author Stephen
 * Employee hierarchy test program.
 */
public class PayrollSyetemTest
{

   public static void main( String[] args )
   {
      // create subclass objects
      SalariedEmployee salariedEmployee
              = new SalariedEmployee( "Paddy", "O'Brien", "111-11-1111", 800.00 );
      HourlyEmployee hourlyEmployee
              = new HourlyEmployee( "John", "Harrington", "222-22-2222", 16.75, 40 );
      PayrollCommissionEmployee payrollCommissionEmployee
              = new PayrollCommissionEmployee(
                      "Micheal", "Fitzpatrick", "333-33-3333", 10000, .06 );
      PayrollBasePlusCommissionEmployee payrollBasePlusCommissionEmployee
              = new PayrollBasePlusCommissionEmployee(
                      "David", "Jones", "444-44-4444", 50000, .04, 300 );

      System.out.println( "Employees processed individually:" );

      System.out.printf( "%n%s%n%s: $%,.2f%n%n",
              salariedEmployee, "earned", salariedEmployee.earnings() );
      System.out.printf( "%s%n%s: $%,.2f%n%n",
              hourlyEmployee, "earned", hourlyEmployee.earnings() );
      System.out.printf( "%s%n%s: $%,.2f%n%n",
              payrollCommissionEmployee, "earned", payrollCommissionEmployee.earnings() );
      System.out.printf( "%s%n%s: $%,.2f%n%n",
              payrollBasePlusCommissionEmployee, "earned", payrollBasePlusCommissionEmployee.earnings() );
      System.out.printf( "%n%s%n%s: $%,.2f%n%n",
              salariedEmployee, "earned", salariedEmployee.earnings() );
      
      // create four-elemnt EmployeePayroll array
      EmployeePayroll[] payrollEmployees = new EmployeePayroll[4];
      
      // initialize array with EmployeePayrolls
      payrollEmployees[0] = salariedEmployee;
      payrollEmployees[1] = hourlyEmployee;
      payrollEmployees[2] = payrollCommissionEmployee;
      payrollEmployees[3] = payrollBasePlusCommissionEmployee;
      
      System.out.printf("Employees processed polymorphically:%n%n");
   
   }   
} // end class PayrollSyetemTest
