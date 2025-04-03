import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        MyObject obj1 = new MyObject("Object_1");
//        MyObject obj2 = new MyObject("Object_2");
//
//        System.out.println(obj1);
//        System.out.println(obj2);
//
//        obj1 = null;
//        obj2 = null;

        // not guaranteed
//        System.gc();

//        Car car1 = new Car("Honda", "Civic", 2025, 70.0);
//        car1.displayInfo();

        // Creating 3 different car objects
        Car car1 = new Car("Toyota", "Camry", 2020, 24.0);
        Car car2 = new Car("Honda", "Civic", 2021, 22.0);
        Car car3 = new Car("Tesla", "Model 3", 2022, 39.99);

        Car[] cars = {car1, car2, car3};

        // Displaying information about each car
//        car1.displayInfo();
//        car2.displayInfo();
//        car3.displayInfo();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Car Info App!");
        String input;

        while (true) {
            System.out.print("Enter car brand or model to get info (or type 'exit' to quit): ");
            input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            // for each loop:
            // for each item in ":" cars array
            // item should be declared with same type of each element in the array 'Car'
            boolean found = false;
            for (Car item : cars) {
               // Check the inserted brand or model if they are equal to any item's  brand or model
                if(item.getBrand().equalsIgnoreCase(input) || item.getModel().equalsIgnoreCase(input)) {
                    item.displayInfo();
                    found = true;

                }
            }
            if (!found) {
                System.out.println("No car found with that brand or model. Try again.");
            }

        }

        // Closing the input stream
        scanner.close();







    }
}