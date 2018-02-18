/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Madza
 */
public class Dealer extends Player {
    
    public Dealer(){
        super();
    }
    
    @Override
    public void giveCard(Card card){
        System.out.println("Dīleris saņēma kārti ");
        hand.addCard(card);
    }
    
    @Override
    public boolean isInGame(){
        //random no 17 līdz 19
      int max = ThreadLocalRandom.current().nextInt(17, 20);
      
      return hand.countPoints() < max;
    }
}
