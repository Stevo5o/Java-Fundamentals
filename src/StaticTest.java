/** @author Stephen */

public class StaticTest {

   public static void main(String[] args) {
      // fill the staff array with three Employee ojects
      Employee[] staff = new Employee[3];
      
      staff[0] = new Employee("Tom", 40000, 1987, 12, 15);
      staff[1] = new Employee("Dick", 40000, 1989, 10, 1);
      staff[2] = new Employee("Harry", 40000, 1990, 3, 15);
   
      // print out all Employee info
      for(Employee e : staff) {
         e.setId();
         System.out.println("name=" + e.getName() +
         ",id=" + e.getId() + ",salary="
                 + e.getSalary());
      }
      
      int n = Employee.getNextId(); // calls static method
      System.out.println("next available id=" + n);
   }
}
