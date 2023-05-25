package factory;

import java.util.Scanner;

public class App {
    public static PenFactory penFactory;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Y for yellow or B for blue");
        String color = sc.nextLine();
        penFactory = new PenFactory();
        Number pen = penFactory.getPen(color);
    }
}
