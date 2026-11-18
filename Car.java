public class Car
{
    // Attributes to store the basic information of a car
    private String brand;
    private String model;
    private int year;
    private double price;
    private int mileage;
    private String color;
    private String owner;

    // Default constructor to give the car default values
    public Car()
    {
        brand = "Unknown";
        model = "Unknown";
        year = 0;
        price = 0.0;
        mileage = 0;
        color = "Unknown";
        owner = "Unknown";
    }

    // Constructor to initialise the car with given information
    public Car(String brand, String model, int year,
               double price, int mileage, String color, String owner)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
        this.color = color;
        this.owner = owner;
    }

    // Getter methods to access the car information
    public String getBrand()
    {
        return brand;
    }

    public String getModel()
    {
        return model;
    }

    public int getYear()
    {
        return year;
    }

    public double getPrice()
    {
        return price;
    }

    public int getMileage()
    {
        return mileage;
    }

    public String getColor()
    {
        return color;
    }

    public String getOwner()
    {
        return owner;
    }

    // Setter methods to update the car information
    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setMileage(int mileage)
    {
        this.mileage = mileage;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    // Method to display all car information
    public void display()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: RM" + price);
        System.out.println("Mileage: " + mileage);
        System.out.println("Color: " + color);
        System.out.println("Owner: " + owner);
    }

    // Method to check the car condition based on its mileage
    public void checkCar()
    {
        if (mileage > 50000)
        {
            System.out.println("Car needs service.");
        }
        else
        {
            System.out.println("Car is in good condition.");
        }
    }

    // Method that displays the type of car
    public void showCarType()
    {
        System.out.println("Car Type: Normal Car");
    }
}
