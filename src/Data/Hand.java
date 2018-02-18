/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;

/**
 *
 * @author Madza
 */
public class Hand {
    ArrayList<Card> cards;
    
    public Hand(){
        cards = new ArrayList();
        //nav obligāti jānorāda <card>(), jo tas ir pēc new
    }
    
    public void addCard(Card card){
        cards.add(card);
    }
    
    public void clearCard(){
        cards.clear();
    }
    
    public Card[] getCards(){
        return cards.toArray(new Card[cards.size()]);
    }
    
    public int countPoints(){
        int total = 0;
        int aceCount = 0;
        
        for(Card card : cards){
            total += card.getValue();
            
            if (card.getValueString().equals("A")){
                aceCount++;
            }
        }
        
        while(total > 21 && aceCount > 0){
            total -= 10;
            aceCount--;
        }
        
        return total;
    }
    
}
