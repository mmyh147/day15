import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Main {

    static List <Vehicle> rentedVehicles = new ArrayList<>();
    public static void main(String[] args) {
        VehicleRentalSystem();

        }

        private static void VehicleRentalSystem(){
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i != 5){
            try{


                System.out.println("Vehicle Rental System");
                System.out.println("1. Rent a Car ");
                System.out.println("2. Rent a bike ");
                System.out.println("3. Rent a Truck ");
                System.out.println("4. View Rented Vehicles ");
                System.out.println("5. Exit ");
                i = input.nextInt();
                switch (i) {
                    case 1:

                        input.nextLine();  // Consume the newline character

                        System.out.println("Enter the model: ");
                        String model = input.nextLine();
                        System.out.println("Enter number of days: ");
                        int days = input.nextInt();
                        Vehicle c = new Car(model, days);
                        rentedVehicles.add(c);
                        c.displayDetails();
                        break;
                    case 2:
                        input.nextLine();  // Consume the newline character

                        System.out.println("Enter the brand: ");
                        String brand = input.nextLine();
                        System.out.println("Enter number of hours: ");
                        int hours = input.nextInt();
                        Vehicle b = new Bike(brand, hours);
                        rentedVehicles.add(b);
                        b.displayDetails();
                        break;
                    case 3:
                        input.nextLine();  // Consume the newline character

                        System.out.println("Enter the type: ");
                        String type = input.nextLine();
                        System.out.println("Enter number of weeks: ");
                        int week = input.nextInt();
                        Vehicle t = new Truck(type, week);
                        rentedVehicles.add(t);
                        t.displayDetails();
                        break;
                    case 4:
                        viewAllRented();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Invalid Input, please enter number from the menu");

                }
            }catch (InputMismatchException e){
                System.out.println("Invalid input");
                input.next();
            }
        }
    }


    private static void viewAllRented(){
        if(!rentedVehicles.isEmpty()){

            System.out.println("Vehicles: ");
            for (Vehicle v : rentedVehicles){
                v.displayDetails();

            }
        }else{
            System.out.println("There are no Vehicles rented!!");
        }
    }

    }
