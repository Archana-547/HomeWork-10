public class Client {
    // Fields
        private String name;
        private double accountBalance;
        private String personalCode;

    // Constructor
    public Client(String name, double accountBalance, String personalCode) {
        this.name = name;
        this.accountBalance = accountBalance;
        this.personalCode = personalCode;

}
    // Method without parameters
    public String sayHello() {
        return "Tere";
    }
    // Method with two input parameters
    public double calculateDifference(double num1, double num2) {
        return num1 - num2;
    }
    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for accountBalance
    public double getAccountBalance() {
        return accountBalance;
    }

    // Setter for accountBalance
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    // Getter for personalCode
    public String getPersonalCode() {
        return personalCode;
    }

    // Setter for personalCode
    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }
}