/**
 * A class for a household item
 *
 * Parameters:
 *   brand - The brand of the household item.
 *   model - The model of the household item.
 *   price - The price of the household item.
 *   color - The color of the household item.
 * 
 * @author Khuliso Junior Ravhuravhu and Arehone Brenden Mbadaliga
 * 
 * @version 1.0
 */

import java.util.Objects;

class Items
{
    private String brand;
    private String model;
    private double price;
    private String color;

    public Items(String brand, String model, double price, String color)
    {
        if (brand == null
                || model == null
                || color == null
                || brand.isEmpty()
                || model.isEmpty()
                || color.isEmpty()
                || price <= 0)
        {
            throw new IllegalArgumentException("Invalid arguments for household item");
        }
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public String getBrand()
    {
        return brand;
    }

    public String getModel()
    {
        return model;
    }

    public double getPrice()
    {
        return price;
    }

    public String getColor()
    {
        return color;
    }

    @Override
    public String toString()
    {
        return "Brand: " + brand + ", Model: " + model + ", Price: $" + price + ", Color: " + color;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Items that = (Items) o;
        return Double.compare(that.price, price) == 0
                && Objects.equals(brand, that.brand)
                && Objects.equals(model, that.model)
                && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(brand, model, price, color);
    }
}