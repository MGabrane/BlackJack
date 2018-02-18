/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import javax.swing.JPanel;

/**
 *
 * @author Madza
 */
public class CardHolder extends JPanel {
    public CardHolder (){
        }
        
        public void addCard(CardImage cardImage){
            this.add(cardImage);
        }
        
        public void clear(){
            this.removeAll();
        }
 
}

