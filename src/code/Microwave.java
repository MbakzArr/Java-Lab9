/**
 * A class for a microwave item
 *
 * Parameters:
 *   brand - The brand of the microwave.
 *   model - The model of the microwave.
 *   price - The price of the microwave.
 *   color - The color of the microwave.
 *   capacity - The capacity of the microwave.
 *   cookingModes - The cooking modes of the microwave.
 *   turntableDiameter - The turntable diameter of the microwave.
 * 
 * @author Khuliso Junior Ravhuravhu and Arehone Brenden Mbadaliga
 * 
 * @version 1.0
 */

class Microwave extends Items
{
    private final int capacity;
    private final String cookingModes;
    private final int turntableDiameter;

    public Microwave(String brand,
                     String model,
                     double price,
                     String color,
                     int capacity,
                     String cookingModes,
                     int turntableDiameter)
    {
        super(brand, model, price, color);
        this.capacity = capacity;
        this.cookingModes = cookingModes;
        this.turntableDiameter = turntableDiameter;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public String getCookingModes()
    {
        return cookingModes;
    }

    public int getTurntableDiameter()
    {
        return turntableDiameter;
    }

    @Override
    public String toString()
    {
        return "Microwave - "
                + super.toString()
                + ", Capacity: "
                + capacity
                + " liters, Cooking Modes: "
                + cookingModes
                + ", Turntable Diameter: "
                + turntableDiameter
                + " inches";
    }
}