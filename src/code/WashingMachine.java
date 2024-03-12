/**
 * a class a washing machine item
 *
 * Parameters:
 *   brand - The brand of the washing machine.
 *   model - The model of the washing machine.
 *   price - The price of the washing machine.
 *   color - The color of the washing machine.
 *   capacity - The capacity of the washing machine.
 *   type - The type of the washing machine (top-load or front-load).
 *   washCycles - The wash cycles of the washing machine.
 * 
 * @author Khuliso Junior Ravhuravhu and Arehone Brenden Mbadaliga
 * 
 * @version 1.0
 */

class WashingMachine extends Items

{
    private final int capacity;
    private final String type;
    private final String washCycles;

    public WashingMachine(String brand,
                          String model,
                          double price,
                          String color,
                          int capacity,
                          String type,
                          String washCycles) {
        super(brand, model, price, color);
        this.capacity = capacity;
        this.type = type;
        this.washCycles = washCycles;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public String getType()
    {
        return type;
    }

    public String getWashCycles()
    {
        return washCycles;
    }

    @Override
    public String toString()
    {
        return "Washing Machine - "
                + super.toString()
                + ", Capacity: "
                + capacity
                + " kg, Type: "
                + type
                + ", Wash Cycles: "
                + washCycles;
    }
}