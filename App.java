package factory;

import java.util.Scanner;

public class App {
    public static BikeFactory bikeFactory;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Child for child bike or Adult for adult");
        String type = sc.nextLine();
        bikeFactory = new BikeFactory();
        Bike bike = bikeFactory.getBike(type);
    }
}
