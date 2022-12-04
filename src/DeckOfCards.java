import java.util.ArrayList;

public class DeckOfCards {
    public static final int DECK_OF_CARDS_LENGTH = 52;
    public static final int SUIT_LENGTH = 4;
    public static final int RANK_LENGTH = 13;
    public static final int NO_OF_PLAYERS = 4;
    public static final int CARDS_PER_PLAYER = 9;
    String[] suit;
    String[] rank;
    Card[] deck;

    public DeckOfCards() {
        suit = new String[]{"Clubs", "Diamonds", "Hearts", "Spades"};
        rank = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        deck = new Card[DECK_OF_CARDS_LENGTH];
    }


    ArrayList<Player> distributeCards() {
        ArrayList<Player> playerList = new ArrayList<>();
        ArrayList<Card> playersCards;
        int cardFromIndex = 0;
        int j;
        for (int i = 0; i < NO_OF_PLAYERS; i++) {
            playersCards = new ArrayList<>();
            for (j = 0; j < CARDS_PER_PLAYER; j++) {
                playersCards.add(deck[cardFromIndex]);
                cardFromIndex++;
            }
            playerList.add(new Player("Player" + (i + 1), playersCards));
        }
        return playerList;
    }

    void printDeck(Card[] deckOfCards) {
        for (Card card : deckOfCards) {
            System.out.println(card);
        }
    }

    void initializeDeck() {
        for (int i = 0; i < DECK_OF_CARDS_LENGTH; i++) {
            deck[i] = new Card(suit[i % SUIT_LENGTH], rank[i % RANK_LENGTH]);
        }
    }

    void shuffle() {
        for (int i = 0; i < DECK_OF_CARDS_LENGTH; i++) {
            int randomIndex = (int) (Math.random() * DECK_OF_CARDS_LENGTH);
            Card temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }
}