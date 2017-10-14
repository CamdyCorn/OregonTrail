package byui.cit260.oregontrail.model;

/**
 *
 * @author Poe & cleaned by Marchylia
 */
public enum ComputerGeneratedCharacter {
    //the Objects are to be added to the Enum Class
    //add in a Location class
    Mister("Mr", "He is the man!", new Location(1,1)),
    Misses("Mrs", "She is the main lady!", new Location(0,1));

    //the Private Class Instance Variables
    private String name;
    private String description;
    private Location coordinates;
    
    ComputerGeneratedCharacter(String name, String description, Location coordinates){
        this.name = name;
        this.description = description;
        this.coordinates = coordinates;
    }

    //the Public Getter Function
    public String getName() {
        return name;
    }

    //the Public Getter Function
    public String getDescription() {
        return description;
    }

    //the Public Getter Function
    public Location getCoordinates() {
        return coordinates;
    }

    @Override
    //the ToString Method
    public String toString() {
        return "ComputerGeneratedCharacter{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + '}';
    }
}