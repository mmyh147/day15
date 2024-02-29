public class Truck implements Vehicle{


    String type;
    int week;

    Truck(){

    }
    public Truck(String type, int week) {
        this.type = type;
        this.week = week;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    @Override
    public double calculateRentalCost() {
        return week * 500;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n========================================");
        System.out.println(" Truck model: " + type);
        System.out.println("weekly Rental Rate: " + 500);
        System.out.println("Rental Cost: " + calculateRentalCost());
        System.out.println("========================================");

    }
}
