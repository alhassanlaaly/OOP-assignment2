public class ServiceRecord
{
    // Private attributes to store car service information
    private String serviceDate;
    private String description;
    private double serviceCost;
    // Constructor to initialise the service record details
    public ServiceRecord(String serviceDate, String description,
                         double serviceCost)
    {
        this.serviceDate = serviceDate;
        this.description = description;
        this.serviceCost = serviceCost;
    }
    // Getter method to access the service date
    public String getServiceDate()
    {
        return serviceDate;
    }
    // Getter method to access the service description
    public String getDescription()
    {
        return description;
    }
    // Getter method to access the service cost
    public double getServiceCost()
    {
        return serviceCost;
    }

    // Setter method to update the service date
    public void setServiceDate(String serviceDate)
    {
        this.serviceDate = serviceDate;
    }
    // Setter method to update the service description
    public void setDescription(String description)
    {
        this.description = description;
    }
    // Setter method to update the service cost
    public void setServiceCost(double serviceCost)
    {
        this.serviceCost = serviceCost;
    }
    // Method to display the service record information
    public void display()
    {
        System.out.println("Service Date: " + serviceDate);
        System.out.println("Description: " + description);
        System.out.println("Service Cost: RM" + serviceCost);
    }
}
