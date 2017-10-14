package OregonTrail;

import byui.cit260.oregontrail.model.Player;
/**
 *
 * @author Poe & cleaned by Marchylia
 */
public class OregonTrail {
    public static void main(String[] args)
    {
        Player playerOne = new Player();
        
        playerOne.setName("Devin Poe");
        playerOne.setBestTime(999.0);
        
        String playerOneName = playerOne.getName();
        double playerOneTime = playerOne.getBestTime();
        
        System.out.println(playerOne.toString());
        //don't copy page 30, but build off it
        //set up the player class
        //set properties
        //print out it's properties to the screen
    }
}
