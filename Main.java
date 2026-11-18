import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        // Scanner is used to get input from the user
        Scanner input = new Scanner(System.in);

        // Create a normal car object
        Car car1 = new Car("Honda", "Civic", 2022,
                           90000.0, 30000, "White", "Laaly");

        // Create an electric car object
        ElectricCar car2 = new ElectricCar("Tesla", "Model 3", 2024,
                           180000.0, 10000, "Black", "Sharvina", 75);

        // Create a sports car object
        SportsCar car3 = new SportsCar("Porsche", "911", 2023,
                           350000.0, 15000, "Red", "Laaly", 300);

        // Create a phone object
        Phone phone1 = new Phone("Apple", "iPhone 18", 256,
                                 5499.0, 15, "Black", "Laaly");

        // Create an owner object
        Owner owner1 = new Owner("Laaly", "0123456789");

        // Create a service record object
        ServiceRecord service1 = new ServiceRecord(
            "18/11/2026", "Engine oil change", 250.0);

        // Use a setter method to update the car colour
        car1.setColor("Blue");

        // Display the system title
        System.out.println("==================================");
        System.out.println(" PHONE AND CAR INFORMATION SYSTEM");
        System.out.println("==================================");

        // Store all three car objects in an array
        Car[] cars = {car1, car2, car3};

        System.out.println("\n----- CAR DETAILS -----");

        // For loop to display the details of each car
        for (int i = 0; i < cars.length; i++)
        {
            System.out.println("\nCar " + (i + 1));

            cars[i].display();

            // Demonstrate polymorphism by calling the same method
            cars[i].showCarType();

            cars[i].checkCar();
        }

        // Display phone information and check its battery
        System.out.println("\n----- PHONE DETAILS -----");

        phone1.display();
        phone1.checkBattery();

        // Display owner information
        System.out.println("\n----- OWNER DETAILS -----");

        owner1.display();

        // Display service record information
        System.out.println("\n----- SERVICE RECORD -----");

        service1.display();

        // Compare the price of the car and phone
        System.out.println("\n----- PRICE COMPARISON -----");

        // If-else statement to compare the prices
        if (car1.getPrice() > phone1.getPrice())
        {
            System.out.println("Car is more expensive.");
        }
        else
        {
            System.out.println("Phone is more expensive.");
        }

        // Check the car colour using a switch statement
        System.out.println("\n----- COLOUR CHECK -----");

        String color = car1.getColor();

        switch (color)
        {
            case "White":
                System.out.println("Color is White.");
                break;

            case "Black":
                System.out.println("Color is Black.");
                break;

            case "Blue":
                System.out.println("Color is Blue.");
                break;

            default:
                System.out.println("Other color: " + color);
                break;
        }

        System.out.println("\n----- FOR LOOP -----");

        // For loop to count from 1 to 3
        for (int i = 1; i <= 3; i++)
        {
            System.out.println("Count number: " + i);
        }

        System.out.println("\n----- WHILE LOOP -----");

        int num = 1;

        // While loop repeats while num is less than or equal to 2
        while (num <= 2)
        {
            System.out.println("While loop round: " + num);
            num++;
        }

        // Ask the user to enter a new phone battery percentage
        System.out.println("\n----- UPDATE PHONE BATTERY -----");

        System.out.print("Enter new battery percentage: ");
        int newBattery = input.nextInt();

        // Check whether the entered battery percentage is valid
        if (newBattery >= 0 && newBattery <= 100)
        {
            // Update the battery using the setter method
            phone1.setBattery(newBattery);

            System.out.println("Battery updated successfully.");

            // Display the updated battery condition
            phone1.checkBattery();
        }
        else
        {
            System.out.println("Invalid battery percentage.");
        }

        // Display a thank you message and close the scanner
        System.out.println("\nThank you for using the system.");

        input.close();
    }
}