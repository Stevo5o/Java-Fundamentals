package B01Advanced;

/**
 * @author Stephen
 * Static member demonstration
 */

public class EmployeeSTest
{
   public static void main(String[] args) 
   {
     // show that count is 0 before creating Employess
      System.out.printf("Employees before instantiation: %d%n",
              EmployeeS.getCount());
      
      // create two Employees; count should be 2
      EmployeeS e1 = new EmployeeS("Susan", "Baker");
      EmployeeS e2 = new EmployeeS("Bob", "Blue");
      
      // show that count is 2 after creating two Employees
      System.out.printf("%nEmployees after instantiation:%n");
      System.out.printf("via e1.getCount(): %d%n", e1.getCount());
      System.out.printf("via e1.getCount(): %d%n", e2.getCount());
      System.out.printf("via Employee.getCount(): %d%n",
              EmployeeS.getCount());      
   }
}
