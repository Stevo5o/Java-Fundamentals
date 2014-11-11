/**
 * @author Stephen
 */
public class DeckOfCardsTest {

   public static void main(String[] args) {

      DeckOfCards myDeckOfCards = new DeckOfCards();
      myDeckOfCards.shuffle(); // shuffle cards algorithm: randomly

      for (int i = 1; i <= 52; i++) {
         
         // deal and display a Card as a String - toString()
         System.out.printf("%-19s", myDeckOfCards.dealCard());
      
         // output a new line after every forth card
         if (i % 4 == 0) { 
            System.out.println();
         }
      }
   }
}
