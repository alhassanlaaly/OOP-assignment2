public class Phone
{
    // Private attributes to store phone information
    private String brand;
    private String model;
    private int storage;
    private double price;
    private int battery;
    private String color;
    private String owner;
    // Default constructor to give the phone default values
    public Phone()
    {
        brand = "Unknown";
        model = "Unknown";
        storage = 0;
        price = 0.0;
        battery = 0;
        color = "Unknown";
        owner = "Unknown";
    }
    // Constructor to initialise the phone with given information
    public Phone(String brand, String model, int storage,
                 double price, int battery, String color, String owner)
    {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.price = price;
        this.battery = battery;
        this.color = color;
        this.owner = owner;
    }
    // Getter methods to access the phone information
    public String getBrand()
    {
        return brand;
    }
    public String getModel()
    {
        return model;
    }
    public int getStorage()
    {
        return storage;
    }
    public double getPrice()
    {
        return price;
    }
    public int getBattery()
    {
        return battery;
    }
    public String getColor()
    {
        return color;
    }
    public String getOwner()
    {
        return owner;
    }
    // Setter methods to update the phone information
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public void setStorage(int storage)
    {
        this.storage = storage;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setBattery(int battery)
    {
        this.battery = battery;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setOwner(String owner)
    {
        this.owner = owner;
    }
    // Method to display all phone information
    public void display()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Price: RM" + price);
        System.out.println("Battery: " + battery + "%");
        System.out.println("Color: " + color);
        System.out.println("Owner: " + owner);
    }
    // Method to check whether the phone battery is low
    public void checkBattery()
    {
        if (battery < 20)
        {
            System.out.println("Battery is low!");
        }
        else
        {
            System.out.println("Battery is okay.");
        }
    }
}
