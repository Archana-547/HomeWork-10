public class Main {


    public static void main(String[] args) {


        Client client1 = new Client("John Doe", 1000.0, "123456");
        Client client2 = new Client("Jane Smith", 2000.0, "789012");
        Client client3 = new Client("Bob Johnson", 1500.0, "345678");

        System.out.println(client1.sayHello());
        System.out.println("The difference is: " + client2.calculateDifference(10.5, 5.2));

        Phone phone1 = new Phone("123456789", "iPhone X", 150.0);
        Phone phone2 = new Phone("987654321", "Samsung Galaxy S20");

        phone1.displayModel();
        phone2.call("555-555-5555");
    }
}