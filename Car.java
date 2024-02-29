public class Car implements Vehicle{


String model;
int days;
double dailyRate = 50;

public Car(){

}
    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost() {
        return days * 50;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n========================================");
        System.out.println("Car Model: " + model);
        System.out.println("Daily Rental Rate: " + dailyRate);
        System.out.println("Rental Cost: " + calculateRentalCost());
        System.out.println("========================================");
    }
}
