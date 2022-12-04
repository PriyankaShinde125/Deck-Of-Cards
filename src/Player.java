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

    public void sort() {
        for (Card card : playersDeck){
            card.setRankValue();
        }
        int counter=0;
        while(counter < PLAYERS_DECK_SIZE) {
            for (int i = 0; i < PLAYERS_DECK_SIZE - 1; i++) {
                if (Integer.valueOf(playersDeck.get(i).getRank()).compareTo(Integer.valueOf(playersDeck.get(i + 1).getRank())) > 0) {
                    Card card = playersDeck.get(i);
                    playersDeck.set(i, playersDeck.get(i + 1));
                    playersDeck.set(i + 1, card);
                }
            }
            counter++;
        }
        for (Card card : playersDeck){
            card.reSetRankValue();
        }
    }
}
