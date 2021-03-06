
import java.util.ArrayList;


/**
 * Represents a deck of cards as an array list
 * TODO: figure out if it should extend ArrayList
 * Created by Hannah Detlaff on 6/7/2018.
 */
public class Deck{

    private ArrayList<Card> cards;
    private static final String[] CARD_NAMES = {"2clubs.png", "3clubs.png", "4clubs.png", "5clubs.png", "6clubs.png",
            "7clubs.png", "8clubs.png", "9clubs.png", "10clubs.png", "Jclubs.png", "Qclubs.png", "Kclubs.png",
            "Aclubs.png", "2hearts.png", "3hearts.png", "4hearts.png", "5hearts.png", "6hearts.png", "7hearts.png",
            "8hearts.png", "9hearts.png", "10hearts.png", "Jhearts.png", "Qhearts.png", "Khearts.png", "Ahearts.png",
            "2spades.png", "3spades.png", "4spades.png", "5spades.png", "6spades.png", "7spades.png", "8spades.png",
            "9spades.png", "10spades.png", "Jspades.png", "Qspades.png", "Kspades.png", "Aspades.png", "2diamonds.png",
            "3diamonds.png", "4diamonds.png", "5diamonds.png", "6diamonds.png", "7diamonds.png", "8diamonds.png",
            "9diamonds.png", "10diamonds.png", "Jdiamonds.png", "Qdiamonds.png", "Kdiamonds.png", "Adiamonds.png"};


    public Deck(){
        cards = new ArrayList<>(52);
        for(int i=0; i<52; i++){
            Card newCard = new Card(CARD_NAMES[i]);
            newCard.setValue(i);
            cards.add(newCard);
        }
    }

    public Deck(ArrayList<Card> cards){
        this.cards=cards;
    }

    public Card getCardAt(int index){
        return cards.get(index);
    }

    public int size(){
        return cards.size();
    }
    public void remove(int index){
        cards.remove(index);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }

}
