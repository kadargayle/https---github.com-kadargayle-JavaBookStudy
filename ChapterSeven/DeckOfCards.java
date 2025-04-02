package ChapterSeven;

/*
Card numbers , , , and  represent 13 Spades, 13 Hearts, 13 Diamonds, and 13 Clubs,

 cardNumber / 13 determines the suit of the card
 cardNumber % 13 determines the rank of the card

  After shuffling the array , pick the first four cards from . The program displays the cards from these four card numbers.
*/

public class DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
        String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

        // Initialize the cards
        for (int i = 0; i < deck.length; i++) {

            deck[i] = i;
        }

        // Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            // Generate an index randomly
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;

        }

        // Display the first four cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }
    }

}
