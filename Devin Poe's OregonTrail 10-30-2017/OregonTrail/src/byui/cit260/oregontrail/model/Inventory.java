/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

/**
 *
 * @author MasterCraft Computer
 */
public class Inventory 
{
    private int pickles;
    private double eggs;
    
    public Inventory()
    {
        this(0, 0);
    }

    public Inventory(int pickles, double eggs)
    {
        this.pickles = pickles;
        this.eggs = eggs;
    }
    
    public int getPickles() {
        return pickles;
    }

    public void setPickles(int pickles) {
        this.pickles = pickles;
    }

    public double getEggs() {
        return eggs;
    }

    public void setEggs(double eggs) {
        this.eggs = eggs;
    }
    
    public double getWeight()
    {
        return this.getPickles() + this.getEggs();
    }
    //probably should be in the view layer
    public void displayWeight()
    {
        System.out.println("you have" + this.getWeight() + "pounds of food.");
    }
}
