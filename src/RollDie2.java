import java.security.SecureRandom;

/**
 * @author Stephen
 */
public class RollDie2 {

   public static void main(String[] args) {

      SecureRandom randomNumbers = new SecureRandom();
      int[] freq = new int[7];

      for (int roll = 1; roll <= 6000000; roll++) {
         ++freq[1 + randomNumbers.nextInt(6)];
      }

      System.out.printf("%s%10s%n", "Face", "Freq");

      for (int face = 1; face < freq.length; face++) {
         System.out.printf("%4d%10d%n", face, freq[face]);
      }
   }
}
