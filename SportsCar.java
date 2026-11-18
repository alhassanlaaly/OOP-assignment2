public class SportsCar extends Car
{
    // Attribute to store the maximum speed of the sports car
    private int topSpeed;
    // Constructor to initialise the car details and top speed
    public SportsCar(String brand, String model, int year,
                     double price, int mileage, String color,
                     String owner, int topSpeed)
    {
        // Call the parent class constructor to initialise car details
        super(brand, model, year, price, mileage, color, owner);

        this.topSpeed = topSpeed;
    }
    // Getter method to access the top speed
    public int getTopSpeed()
    {
        return topSpeed;
    }
    // Setter method to update the top speed
    public void setTopSpeed(int topSpeed)
    {
        this.topSpeed = topSpeed;
    }
    // Override the parent method to display sports car information
    @Override
    public void showCarType()
    {
        System.out.println("Car Type: Sports Car");
        System.out.println("Top Speed: " + topSpeed + " km/h");
    }
}

