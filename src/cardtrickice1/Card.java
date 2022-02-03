package cardtrickice1;

/**
 *This class define card calue and suits
 *
 * @author William Chen
 *student number:991664233
 */
public class Card {
    private int value;
    private String suits;//encapsulation
    //constant
    public static final String[] SUITS = {"diamonds", "clubs", "spades", "hearts"};
    public static final int[] Value = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    
    
    /**public Card(String s, int v){
        this.suits = s;
        this.value = v;
    }
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the suits
     */
    public String getSuits() {
        return suits;
    }

    /**
     * @param suits the suits to set
     */
    public void setSuits(String suits) {
        this.suits = suits;
    }
    //number
    
    //suitl
}
