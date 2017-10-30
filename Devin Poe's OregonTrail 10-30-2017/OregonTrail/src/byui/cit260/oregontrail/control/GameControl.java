/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import OregonTrail.OregonTrail;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Player;


/**
 *
 * @author Marchylia
 */
public class GameControl 
{

    public static Player createPlayer(String name)
    {
           if (name == null)
           {
               return null;
           }
           
           Player player = new Player();
           player.setName(name);
           
           OregonTrail.setPlayer(player);
           
           return player;
    }

    public static void createNewGame(Player player) 
    {
        System.out.println("\n*** createNewGame() function called ***");
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
