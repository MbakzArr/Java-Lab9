/**
 * a class for laptop item
 *
 * Parameters:
 *   brand - The brand of the laptop.
 *   model - The model of the laptop.
 *   price - The price of the laptop.
 *   color - The color of the laptop.
 *   screenSize - The screen size of the laptop.
 *   processorType - The processor type of the laptop.
 * 
 * @author Khuliso Junior Ravhuravhu and Arehone Brenden Mbadaliga
 * 
 * @version 1.0
 */

class Laptop extends Items
{
    private final double screenSize;
    private final String processorType;

    public Laptop(String brand,
                  String model,
                  double price,
                  String color,
                  double screenSize,
                  String processorType)
    {
        super(brand, model, price, color);
        this.screenSize = screenSize;
        this.processorType = processorType;
    }

    public double getScreenSize()
    {
        return screenSize;
    }

    public String getProcessorType()
    {
        return processorType;
    }

    @Override
    public String toString()
    {
        return "Laptop - "
                + super.toString()
                + ", Screen Size: "
                + screenSize
                + " inches, Processor Type: "
                + processorType;
    }
}