package byui.cit260.oregontrail.model;

import java.io.Serializable;

/**
 *
 * @author Poe
 */
public class Point implements Serializable 
{
    int xcoordinate;
    int ycoordinate;
    
    public Point()
    {
        
    }
    public Point(int x, int y)
    {
        xcoordinate = x;
        ycoordinate = y;
    
    }
    @Override
    public String toString() {
        return "Point{" + "xcoordinate=" + xcoordinate + ", ycoordinate=" + ycoordinate + '}';
    }

    public int getXcoordinate() {
        return xcoordinate;
    }

    public void setXcoordinate(int xcoordinate) {
        this.xcoordinate = xcoordinate;
    }

    public int getYcoordinate() {
        return ycoordinate;
    }

    public void setYcoordinate(int ycoordinate) {
        this.ycoordinate = ycoordinate;
    }
}
