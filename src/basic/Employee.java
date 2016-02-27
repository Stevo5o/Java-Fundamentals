package A00Basic;

import java.util.*;

/**
 * @author Stephen
 */
class Employee {

   private static int nextId = 1;
   private String name;
   private double salary;
   private Date hireDay;
   private int id;

   public Employee(String name, double salary, int year, int month, int day) {
      this.name = name;
      this.salary = salary;
      id = 0;
      GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
      // GregorianCalendar uses 0 for Jan
      hireDay = calendar.getTime();
   }

   public String getName() {
      return name;
   }

   public double getSalary() {
      return salary;
   }

   public Date getHireDay() {
      return hireDay;
   }

   public void raiseSalary(double byPercent) {
      double raise = salary * byPercent / 100;
      salary += raise;
   }

   public int getId() {
      return id;
   }

   public void setId() {

      id = nextId; // set id to next available id
      nextId++;
   }

   public static int getNextId() {
      return nextId;  // return static field
   }

   // unit test
   public static void main(String[] args) {
      Employee e = new Employee("Harry ", 5000, 1987, 12, 15);
      System.out.println(e.getName() + "" + e.getSalary());
   }
}
