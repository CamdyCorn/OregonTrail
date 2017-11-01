/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Player;


/**
 *
 * @author Marchylia
 */
public class GameControl {

    public static void createNewGame(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Player createPlayer(String playersName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getNoPeople(int noPeople, int male, int female) {
        if (noPeople < 1 || noPeople > 40) {
            return -1;
        }
        else if (male < 1 || male > 39 || female < 1 || female > 39) {
                return -1;
            }
        else {
            noPeople = male + female;
            
            return noPeople;
        }
    }
}