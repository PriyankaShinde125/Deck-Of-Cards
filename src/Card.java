public class Card {
    String suit;
    String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setRankValue() {
        if (rank.equals("Ace"))
            rank = "1";
        if (rank.equals("Jack"))
            rank = "11";
        if (rank.equals("Queen"))
            rank = "12";
        if (rank.equals("King"))
            rank = "13";
    }
    public void reSetRankValue() {
        if (rank.equals("1"))
            rank = "Ace";
        if (rank.equals("11"))
            rank = "Jack";
        if (rank.equals("12"))
            rank = "Queen";
        if (rank.equals("13"))
            rank = "King";
    }

    @Override
    public String toString() {
        return rank + "_" + suit + "\t";
    }
}
