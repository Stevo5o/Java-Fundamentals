package B01Advanced;

/**
 * @author Stephen. enum types: enum types are referencce types. enum
 * declaration + Comma-separated list of enum constants. Optional: constructors,
 * fields and methods. enum constants are implicitly final and static. Cannot
 * create an object of an enum type with new. enum constants can be used
 * anywhere constants can be used(e.g., switch case labels, control enhanced for
 * statements)
 */

// Declare an enum type with constructor and explicit instance fields
// and accessors for these fields 

public enum Book
{
   // declare constants of enum type
   JHTP("Java How to Program", "2015"),
   CHTP("C How to Program", "2013"),
   CCHTP("C++ How to Program", "2014"),
   VBHTP("Visual Basic How to Program", "2014"),
   CSHARPHTP("Visual C# How to Program", "2014");
   
   // instance fields
   private final String title;
   private final String copyrightYear;
   
   // euum constructor
   Book(String title, String copyrightYear)
   {
      this.title = title;
      this.copyrightYear = copyrightYear;
   }
   
   // accessor for field title
   public String getTitle() 
   {
      return title;
   }
   
   // accessor for field copyrightYear
   public String getCopyrightYear()
   {
      return copyrightYear;
   }
} // enum class
