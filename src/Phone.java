public class Phone {

    // Fields
    private String number;
    private String model;
    private double weight;

    // Constructor with three parameters
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Constructor with two parameters
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    // Method to display the phone model
    public void displayModel() {
        System.out.println("Phone Model: " + model);
    }

    // Method to call a phone number
    public void call(String phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    // Getter for number
    public String getNumber() {
        return number;
    }

    // Setter for number
    public void setNumber(String number) {
        this.number = number;
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }

    // Setter for weight
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }
}
