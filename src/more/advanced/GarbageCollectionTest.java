package B01Advanced;

/**
 * @author Stephen. Garbage Collection. Every object sues system resources, such
 * as memory. Automatic garbage collection + An unreferenced object is eligible
 * to be collected + JVM executes its garbage collector to reclaim memory.
 * Memory leaks are less likely in Java, but can happen + Maintain a reference
 * to an object that's never used + One object refers to another and vice
 * versa(island). Resource leaks other than memory leaks can occur + App opens a
 * file on disk to modify its contents
 */
public class GarbageCollectionTest
{

   public static void main(String[] args)
   {
      {

         int arr1[] =
         {
            0, 1, 2, 3, 4, 5
         };
         int arr2[] =
         {
            0, 10, 20, 30, 40, 50
         };

         // copies an array from the specified source array
         System.arraycopy(arr1, 0, arr2, 0, 1);
         System.out.print("array2 = ");
         System.out.print(arr2[0] + " ");
         System.out.println(arr2[1] + " ");

         // it runs the GarbageCollector
         System.gc();
         System.out.println("Cleanup completed...");
      }
   }
}
