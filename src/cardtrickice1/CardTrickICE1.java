package cardtrickice1;

import static cardtrickice1.Card.SUITS;
import static cardtrickice1.Card.Value;
import java.util.Scanner;

/**
 *step1: generate 7 random cards and store in array - how
 *step2: take any card input from user suit, number
 * step3: user card is in the array 'card is found'
 * 
 * @author William Chen
 */
public class CardTrickICE1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];//Array of object
        for( int i=0;i<magicHand.length;i++){
            Card c1 = new Card();
            c1.setValue(Value[(int)(Math.random()*Value.length)]);//use a method to generate random*13
            c1.setSuits(SUITS[(int)(Math.random()*SUITS.length)]);//random method suit 
            magicHand[i]=c1;
        }
        //step 2:take input
        Card[] deck = new Card[1];
        Card cardIn = new Card();
        Scanner input = new Scanner(System.in);
        System.out.println("enter your card: ");
        cardIn.setSuits(input.next());
        cardIn.setValue(input.nextInt());
        deck[0] = cardIn;
        
        //step 3:match with array
        for (int j=0;j<magicHand.length;j++){
            if(magicHand[j] == deck[0])
                System.out.println("Your card is generated");
            else
                System.out.println("Your card isn't generated");
         
        }
    }
    

}