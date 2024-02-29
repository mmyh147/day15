public class Bike implements Vehicle{

String brand;
int hour;
Bike(){

}
    public Bike(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public double calculateRentalCost() {
        return hour * 10;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n========================================");
        System.out.println("Car Model: " + brand);
        System.out.println("Hourly Rental Rate: " + 10);
        System.out.println("Rental Cost: " + calculateRentalCost());
        System.out.println("========================================");

    }
}
