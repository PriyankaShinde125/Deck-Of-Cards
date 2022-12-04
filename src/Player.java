import java.util.ArrayList;
import java.util.Arrays;

public class Player {
    public static final int PLAYERS_DECK_SIZE = 9;
    String playerName;
    ArrayList<Card> playersDeck;

    public Player(String playerName, ArrayList<Card> playersDeck) {
        this.playerName = playerName;
        this.playersDeck = playersDeck;
    }

    @Override
    public String toString() {
        String playersDetails = playerName + " : ";
        for (Card card :playersDeck) {
            playersDetails = playersDetails + card;
        }
        return playersDetails;
    }
}
