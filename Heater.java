
/**
 * The purpose of this project is to create class heater which has a default
 * temperature and can be increased or decreased using mutators.
 *
 * @author (Ankit Bhargava)
 * @version (1.0 - 30/01/2019)
 */
public class Heater
{
    // declaring instance variable for heater's temperature
    private double temperature;

    /**
     * Constructor for objects of class Heater that has temperature of 15 degrees
     */
    
    public Heater()
    {
        // initialise instance variables
        temperature = 15.0;
    }
    
     /**
     * Creating a method to decrease the temperature by 5 degrees
     */
    public void cooler()
    {
        temperature -= 5.0;
    }
    
         /**
     * Creating a method to increase the temperature by 5 degrees
     */
    public void warmer()
    {
        temperature += 5.0;
    }
    
     /**
     * Creating an accesser method to return the temperature
     */
    public double displayTemp()
    {
        return temperature;
    }


}
