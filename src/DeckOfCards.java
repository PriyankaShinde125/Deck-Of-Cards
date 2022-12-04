import java.util.ArrayList;

public class DeckOfCards {
    public static final int DECK_OF_CARDS_lENGTH = 52;
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
        deck = new Card[DECK_OF_CARDS_lENGTH];
    }

    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.initializeDeck();
        deckOfCards.shuffle();
        deckOfCards.printDeck(deckOfCards.deck);
        deckOfCards.distributeCards();
    }

    private void distributeCards() {
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
        for (Player player : playerList) {
            System.out.println(player);
        }
    }

    private void printDeck(Card[] deckOfCards) {
        for (Card card : deckOfCards) {
            System.out.println(card);
        }
    }

    private void initializeDeck() {
        for (int i = 0; i < DECK_OF_CARDS_lENGTH; i++) {
            deck[i] = new Card(suit[i % SUIT_LENGTH], rank[i % RANK_LENGTH]);
        }
    }

    private void shuffle() {
        for (int i = 0; i < DECK_OF_CARDS_lENGTH; i++) {
            int randomIndex = (int) (Math.random() * DECK_OF_CARDS_lENGTH);
            Card temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }
}