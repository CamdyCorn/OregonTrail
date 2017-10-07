package byui.cit260.oregontrail.model;

/**
 *
 * @author Poe
 */
public enum Actor {
    //objects to be added to the enum class
    //add in a point class
    Bob("Satchel", "His IS BOB!", new Point (1,1)),
    Snob("Snobbington", "He is a snob.", new Point(0,1));
    //Feel free to add in as many characters as you please, I just kept with 2
    //for simplicity sake.
    //attribute variables
    private String name;
    private String description;
    private Point coordinates;

    
    
    Actor(String name, String description, Point coordinates){
        this.name = name;
        this.description = description;
        this.coordinates = coordinates;
    }



}
