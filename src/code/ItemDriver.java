/**
 * Driver class for testing household item storage.
 *
 * Parameters:
 *   None
 * 
 * @author Khuliso Junior Ravhuravhu and Arehone Brenden Mbadaliga
 * 
 * @version 1.0
 */

public class ItemDriver
{
    public static void main(String[] args)
    {
        // Create instances of household items
        Television tv = new Television("Samsung", "Smart TV", 799.99, "Black", 55, "4K", true);
        Refrigerator fridge = new Refrigerator("LG", "French Door Fridge", 1499.99, "Stainless Steel", 600, 3, "Frost-Free");
        Microwave microwave = new Microwave("Panasonic", "Countertop Microwave", 129.99, "White", (int) 1.2, "Defrost, Reheat, Cook", 12);
        WashingMachine washingMachine = new WashingMachine("Whirlpool", "Front Load Washer", 899.99, "Gray", 8, "Front-load", "Normal, Delicate, Heavy Duty");
        Laptop laptop = new Laptop("Dell", "Inspiron", 999.99, "Silver", 15.6, "Intel Core i7");

        // Create a storage collection
        ItemStorage storage = new ItemStorage();

        // Add items to the storage
        storage.addItem(tv);
        storage.addItem(fridge);
        storage.addItem(microwave);
        storage.addItem(washingMachine);
        storage.addItem(laptop);

        // Display items in the storage
        storage.displayItems();

        // Remove an item from the storage
        storage.removeItem(laptop);

        // Display items in the storage after removal
        storage.displayItems();

        // Get the number of items in the storage
        int itemCount = storage.getItemCount();
        System.out.println("Number of items in storage: " + itemCount);
    }
}
