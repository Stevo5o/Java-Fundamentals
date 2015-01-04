package B01Advanced;

import java.util.EnumSet;

/**
 * @author Stephen
 */
public class EnumTest
{

   public static void main(String[] args)
   {
      System.out.println("All books:");

      // print all books in enum Book 
      for (Book book : Book.values())
      {
         System.out.printf("%-10s%-45s%s%n", book,
                 book.getTitle(), book.getCopyrightYear());
      }

      System.out.printf("%nDisplay a range of enum constants:%n");

      // print first four books 
      for (Book book : EnumSet.range(Book.JHTP, Book.CCHTP))
      {
         System.out.printf("%-10s%-45s%s%n", book,
                 book.getTitle(), book.getCopyrightYear());
      }

      System.out.printf("%nDisplay a range of enum constants:%n");
   }
} // end class EnumTest
