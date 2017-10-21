/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Inventory;

/**
 *
 * @author Camden
 */
public class InventoryControl {
    
    public double getWeight(double Pickles, double Eggs) {
	if (Pickles < 0 || Pickles > 100) {
		return -1;
        }
        else if (Eggs < 0 || Eggs > 100) {
                 return -1;
        }
        else {
            return Pickles + Eggs;
        }
}
}
