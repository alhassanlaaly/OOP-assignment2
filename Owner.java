public class Owner
{
    // Private attributes to store the owner's information
    private String name;
    private String phoneNumber;
    // Constructor to initialise the owner's details
    public Owner(String name, String phoneNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    // Getter method to access the owner's name
    public String getName()
    {
        return name;
    }
    // Getter method to access the owner's phone number
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    // Setter method to update the owner's name
    public void setName(String name)
    {
        this.name = name;
    }
    // Setter method to update the owner's phone number
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    // Method to display the owner's information
    public void display()
    {
        System.out.println("Owner Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
