import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<Card>();

    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void addCard(Card card){
        this.hand.add(card);
    }

    public int getHandCount() {
        return hand.size();
    }

    public int getFirstCard() {
        return hand.get(0).getRank().getValue();
    }
}
