package B01Advanced;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Stephen
 * Compound-interest calculations with BigDecimal
 */
public class Interest
{
   
   public static void main(String[] args)
   {
      // initial principal before interest
      BigDecimal principal = BigDecimal.valueOf(1000.0); 
      BigDecimal rate = BigDecimal.valueOf(0.05); 
      Locale loc = new Locale("en", "IE");
      
      // display headers
      System.out.printf("%s%20s%n", "Year", "Amount on deposit");
      
      // calculate amount on deposit for each of the ten years
      for (int year =1; year <=10; year++)
      {
         // calculate new amount for specified year
         BigDecimal amount = 
                 principal.multiply(rate.add(BigDecimal.ONE).pow(year));
         
         // display the year and the amount
         System.out.printf("%4d%20s%n", year,
                 NumberFormat.getCurrencyInstance(loc).format(amount));
      }
   }
} // end Interest class
