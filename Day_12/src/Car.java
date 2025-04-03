public class Car {

   // === Instance Variables ===
  private  String brand;
  private  String model;
  private   int year;
  private   double price;

    // Constructor

    // Parameterized constructor
    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Empty constructor
    public Car() {
    }


    // Display Car Info
    public void displayInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Price: €" + this.price + "K");
        System.out.println("----------------------------");
    }


    // Getters and Setters

    public String getBrand() {
        if(this.brand.isEmpty()){
            return "No brand yet";
        }
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
