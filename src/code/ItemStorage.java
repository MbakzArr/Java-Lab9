import java.util.ArrayList;
import java.util.List;

// Storage class to manage collections of household items
class ItemStorage
{
    private final List<Items> items;

    public ItemStorage()
    {
        this.items = new ArrayList<>();
    }

    public void addItem(Items item)
    {
        if (item == null)
        {
            throw new IllegalArgumentException("Item cannot be null");
        }
        items.add(item);
    }

    public void removeItem(Items item)
    {
        if (item == null)
        {
            throw new IllegalArgumentException("Item cannot be null");
        }
        items.remove(item);
    }

    public void displayItems()
    {
        System.out.println("Items in storage:");
        for (Items item : items)
        {
            System.out.println(item);
        }
        System.out.println();
    }

    public int getItemCount()
    {
        return items.size();
    }
}
