package A00Basic;

/**
 * @author Stephen
 */
import java.security.SecureRandom;

public class DeckOfCards {

   private Card[] deck; // array of Card objects
   private int currentCard; // 
   private static final int NUMBER_OF_CARDS = 52;
   private static final SecureRandom randomNumbers = new SecureRandom();

   // constructor 
   public DeckOfCards() {

      String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", 
         "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
      String[] suits = {"Hearts", "Diamond", "Clubs", "Spades"};

      deck = new Card[NUMBER_OF_CARDS]; // create an array of Card objects
      currentCard = 0; // first Card dealt will be deck[0]

      // populate deck with Card objects for reference type array
      for (int count = 0; count < deck.length; count++) {
         deck[count] = 
                 new Card(faces[count % 13], suits[count / 13]);
      }
   }

   // shuffle deck of Cards with one-pass algorithm
   public void shuffle() {

      currentCard = 0;

      for (int first = 0; first < deck.length; first++) {
         int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

         Card temp = deck[first];
         deck[first] = deck[second];
         deck[second] = temp;
      }
   }

   // deal one Card
   public Card dealCard() {

      if (currentCard < deck.length) {
         return deck[currentCard++];
      } else {
         return null;
      }
   }
}
