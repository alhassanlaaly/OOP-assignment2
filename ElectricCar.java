public class ElectricCar extends Car
{
    // Attribute to store the battery capacity of the electric car
    private int batteryCapacity;
    // Constructor to initialise the car details and battery capacity
    public ElectricCar(String brand, String model, int year,
                       double price, int mileage, String color,
                       String owner, int batteryCapacity)
    {
        // Call the parent class constructor to initialise car details
        super(brand, model, year, price, mileage, color, owner);

        this.batteryCapacity = batteryCapacity;
    }
    // Getter method to access the battery capacity
    public int getBatteryCapacity()
    {
        return batteryCapacity;
    }
    // Setter method to update the battery capacity
    public void setBatteryCapacity(int batteryCapacity)
    {
        this.batteryCapacity = batteryCapacity;
    }
    // Override the parent method to display electric car information
    @Override
    public void showCarType()
    {
        System.out.println("Car Type: Electric Car");
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}
