/**
 * Created by Hannah Detlaff on 6/7/2018.
 * A class that represents a single card
 */
public class Card {
    private String imageName;
    private int value;
    boolean faceup = true;

    public Card(String cardName){
        imageName = cardName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isFaceup() {
        return faceup;
    }

    public void setFaceup(boolean faceup) {
        this.faceup = faceup;
    }

    @Override
    public String toString() {
        return "faceup= " +faceup ;
//                "Card{" +
//                 imageName +
//                ", faceup=" + faceup +
//                "value=" + value +'}';
    }
}
