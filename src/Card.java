import javax.imageio.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Hannah Detlaff on 6/7/2018.
 * A class that represents a single card
 */
public class Card{
    private String imageName;
    private int value;
    boolean faceup = true;
    BufferedImage img;

    public Card(String cardName){
        imageName = cardName;
        BufferedImage img = null;
        try{
            img =ImageIO.read(new File("src/cards/" +imageName));
        } catch (IOException e){
            System.out.println("There was an issue here");
        }
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

    public BufferedImage getImg() {
        return img;
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
