import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;

    public Game(ArrayList players){
        this.players = players;
        this.deck = new Deck();
    }

    public Deck getDeck() {
        return deck;
    }


    public void start() {
        deck.fillDeck();
        deck.shuffle();
        for(Player player: players){
            player.addCard(deck.dealCard());
        }
    }

    public Player checkWinner() {
        int value = 0;
        Player winner = new Player("");
        for (Player player: players) {
            if(player.getFirstCard() > value){
                value = player.getFirstCard();
                winner = new Player(player.getName());
            }

        }
        return winner;
    }
}
