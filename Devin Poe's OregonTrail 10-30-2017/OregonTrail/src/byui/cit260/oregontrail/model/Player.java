package byui.cit260.oregontrail.model;

import java.io.Serializable;
import java.util.Objects;
import byui.cit260.oregontrail.model.Pace;

/**
 *
 * @author Owner
 */
public class Player implements Serializable
{
     //class instance variables
    private String name;
    private double bestTime;
    private int currentHealth;
    //constructor method
    
    Pace playerPace;
    public Player() 
    {
      this.playerPace = new Pace();
      this.currentHealth = 10;
    }

    public int getPlayerPace() {
        return playerPace.getSpeed();
    }

    public void setSlow()
    {
       playerPace.Slow();
    }
    public void setAverage()
    {
        playerPace.Average();
    }
    public void setFast()
    {
        playerPace.Fast();
    }
    public void setPlayerPace(Pace playerPace) {
        this.playerPace = playerPace;
    }
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public double getBestTime() 
    {
        return bestTime;
    }

    public void setBestTime(double bestTime) 
    {
        this.bestTime = bestTime;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }
   

/*
public class Player implements Serializable
{
     //class instance variables
    private String name;
    private double bestTime;
    //constructor method
    public Player() 
    {
      
    }
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public double getBestTime() 
    {
        return bestTime;
    }

    public void setBestTime(double bestTime) 
    {
        this.bestTime = bestTime;
    }

>>>>>>> origin/master
    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.bestTime) ^ (Double.doubleToLongBits(this.bestTime) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.bestTime) != Double.doubleToLongBits(other.bestTime)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "Player{" + "name=" + name + ", bestTime=" + bestTime + '}';
    }   
*/
}
