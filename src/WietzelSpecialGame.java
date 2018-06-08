
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.awt.*;




/**
 * A solitaire game passed down through my family
 * Created by Hannah Detlaff on 6/7/2018.
 */
public class WietzelSpecialGame extends Component implements MouseListener, MouseMotionListener{
    private Deck deck;
    private static final String cardback= "CardBack.png";
    private ArrayList<Card>[] gamePos;
    private JFrame frame = new JFrame("Wietzel Special");


    public WietzelSpecialGame(){
        deck = new Deck();
        gamePos = new ArrayList[7];
        deal();
        run();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        Card card = new Card(gamePos[0].get(0).getImageName());
        System.out.print(gamePos[0].get(0).getImageName());
        //frame.add(card.getImg());
        frame.setVisible(true);
        //System.out.println(deck);


        addMouseListener(this);
        addMouseMotionListener(this);

    }

    /**
     * converts the deck into a gamePos
     * first 3 rows will have 8 to start and the last 4 will have 7
     */
    public void deal(){
        shuffle();
        ArrayList<Card> col1 =new ArrayList<>(8);
        ArrayList<Card> col2 =new ArrayList<>(8);
        ArrayList<Card> col3 =new ArrayList<>(8);
        ArrayList<Card> col4 =new ArrayList<>(7);
        ArrayList<Card> col5 =new ArrayList<>(7);
        ArrayList<Card> col6 =new ArrayList<>(7);
        ArrayList<Card> col7 =new ArrayList<>(7);
        for(int i=0; i<8; i++){
            col1.add(deck.getCardAt(i));
            col2.add(deck.getCardAt(i+8));
            col3.add(deck.getCardAt(i+16));
            if(i<7){
                col4.add(deck.getCardAt(i+24));
                col5.add(deck.getCardAt(i+31));
                col6.add(deck.getCardAt(i+38));
                col7.add(deck.getCardAt(i+45));
            }
        }
        gamePos[0]=col1;
        gamePos[1]=col2;
        gamePos[2]=col3;
        gamePos[3]=col4;
        gamePos[4]=col5;
        gamePos[5]=col6;
        gamePos[6]=col7;

        for(int i=0; i<7; i++){
            for(int j=0; j<i; j++){
                gamePos[i].get(j).setFaceup(false);
            }
        }

    }

    public void shuffle(){
        ArrayList<Card> temp = new ArrayList<>(52);
        for(int i=deck.size(); i>0; i--){
            int index= (int)(Math.random()*i);
            temp.add(deck.getCardAt(index));
            deck.remove(index);
        }
        Deck newDeck = new Deck(temp);
        deck=newDeck;
    }

    public void run(){
        //System.out.print(deck);
        Deck col1= new Deck(gamePos[0]);
        Deck col2= new Deck(gamePos[1]);
        Deck col3= new Deck(gamePos[2]);
        Deck col4= new Deck(gamePos[3]);
        Deck col5= new Deck(gamePos[4]);
        Deck col6= new Deck(gamePos[5]);
        Deck col7= new Deck(gamePos[6]);
        System.out.println(col1);
        System.out.println(col2);
        System.out.println(col3);
        System.out.println(col4);
        System.out.println(col5);
        System.out.println(col6);
        System.out.println(col7);


    }

    public void paint(Graphics g){
        g.drawImage(gamePos[0].get(0).getImg(), 0, 0, null);
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
