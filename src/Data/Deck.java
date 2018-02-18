/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Madza
 */
public class Deck {
    private ArrayList<Card> cards;
    
    private static final char[] suits = new char[]{
        'H', 'S', 'D', 'C'
    };
    
    private static final String[] values = new String[]{
        "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "J", "Q", "K", "A"
    };
    
    public Deck(){
        cards = new ArrayList<Card>();
       /* for(int i = 0; i < suits.length; i++){
            char suit = suits[i];
        }*/
        //tas pats, kas
        for(char suit : suits){
            for(String value : values){
                cards.add(new Card(value, suit));
            }     
        }
    }
    public void shuffle(){
        Collections.shuffle(cards);
    }
    public Card takeCard(){
        Card topCard = cards.get(0);
        cards.remove(0);
        
        return topCard;
    }
}
