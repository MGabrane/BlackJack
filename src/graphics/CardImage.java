/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import Data.Card;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Madza
 */
public class CardImage extends JLabel {
    
    public CardImage(Card card){
        String cardName;
     
        if(card.isBlind){
            cardName = "00.png";
        }else{
            cardName = card.getFullName() + ".png";
        }
        
        //String cardName = card.isBlind ? "00.png" : card.getFullName() + ". png";
        
        this.setIcon(new ImageIcon(getClass().getResource("/images/" + cardName)));
    }
    
}
