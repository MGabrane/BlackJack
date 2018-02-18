/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.blackjack;

import Data.Game;

/**
 *
 * @author Madza
 */
public class LvRigacodingBlackJack {
    private static Game game;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       game = new Game();
       
       while(game.startNewGame())
       {
           
       }
    }
    
}
