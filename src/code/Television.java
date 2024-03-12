/**
 * class for a television item
 *
 * Parameters:
 *   brand - The brand of the television.
 *   model - The model of the television.
 *   price - The price of the television.
 *   color - The color of the television.
 *   screenSize - The screen size of the television.
 *   resolution - The resolution of the television.
 *   smartFeatures - Indicates if the television has smart features.
 * 
 * @author Khuliso Junior Ravhuravhu and Arehone Brenden Mbadaliga
 * 
 * @version 1.0
 */

class Television extends Items
{
    private final int screenSize;
    private final String resolution;
    private final boolean smartFeatures;

    public Television(String brand,
                      String model,
                      double price,
                      String color,
                      int screenSize,
                      String resolution,
                      boolean smartFeatures)
    {
        super(brand, model, price, color);
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.smartFeatures = smartFeatures;
    }

    public int getScreenSize()
    {
        return screenSize;
    }

    public String getResolution()
    {
        return resolution;
    }

    public boolean hasSmartFeatures()
    {
        return smartFeatures;
    }

    @Override
    public String toString()
    {
        return "Television - "
                + super.toString()
                + ", Screen Size: "
                + screenSize
                + " inches, Resolution: "
                + resolution
                + ", Smart Features: "
                + (smartFeatures ? "Yes" : "No");
    }
}