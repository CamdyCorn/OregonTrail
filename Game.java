package byui.cit260.oregontrail.model;

import java.io.Serializable;

/**
 *
 * @author Poe & cleaned by Marchylia
 */
public class Game implements Serializable {
    //the Private Class Instance Variables
    private double totalTime;
    private int numOfPeople;
    private Player player;
    
    //the Default Constructor 
    public Game() { 
    }

    //the Public Getter Function
    public double getTotalTime() {
        return totalTime;
    }

    //the Public Setter Function
    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    //the Public Getter Function
    public int getNumOfPeople() {
        return numOfPeople;
    }

    //the Public Setter Function
    public void setNumOfPeople(int noPeople) {
        this.numOfPeople = numOfPeople;
    }

    //the Public Getter Function
    public Player getPlayer() {
        return player;
    }

    //the Public Setter Function
    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    //the HashCode Method
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 23 * hash + this.numOfPeople;
        hash = 23 * hash + (this.player != null ? this.player.hashCode() : 0);
        return hash;
    }

    @Override
    //the Equals Method
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (this.numOfPeople != other.numOfPeople) {
            return false;
        }
        if (this.player != other.player && (this.player == null || !this.player.equals(other.player))) {
            return false;
        }
        return true;
    }
}