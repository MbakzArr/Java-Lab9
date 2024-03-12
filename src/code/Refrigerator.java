/**
 * a class for refrigerator item
 *
 * Parameters:
 *   brand - The brand of the refrigerator.
 *   model - The model of the refrigerator.
 *   price - The price of the refrigerator.
 *   color - The color of the refrigerator.
 *   capacity - The capacity of the refrigerator.
 *   numDoors - The number of doors of the refrigerator.
 *   coolingTechnology - The cooling technology of the refrigerator.
 * 
 * @author Khuliso Junior Ravhuravhu and Arehone Brenden Mbadaliga
 * 
 * @version 1.0
 */

class Refrigerator extends Items
{
    private final int capacity;
    private final int numDoors;
    private final String coolingTechnology;

    public Refrigerator(String brand,
                        String model,
                        double price,
                        String color,
                        int capacity,
                        int numDoors,
                        String coolingTechnology)
    {
        super(brand, model, price, color);
        this.capacity = capacity;
        this.numDoors = numDoors;
        this.coolingTechnology = coolingTechnology;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public int getNumDoors()
    {
        return numDoors;
    }

    public String getCoolingTechnology()
    {
        return coolingTechnology;
    }

    @Override
    public String toString()
    {
        return "Refrigerator - " + super.toString()
                + ", Capacity: " + capacity + " liters, Number of Doors: "
                + numDoors + ", Cooling Technology: " + coolingTechnology;
    }
}