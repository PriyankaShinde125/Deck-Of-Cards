import java.util.ArrayList;

public class PlayGame {

    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.initializeDeck();
        deckOfCards.shuffle();
        deckOfCards.printDeck(deckOfCards.deck);
        ArrayList<Player> playersList = deckOfCards.distributeCards();
        for (Player player : playersList) {
            player.sort();
        }
        for (Player player : playersList) {
            System.out.print(player + " \n");
        }
    }
}
