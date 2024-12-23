package lvl5week3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "foods.txt";

        try (FileWriter writer = new FileWriter(fileName, true)) {
            System.out.println("Enter food names to store in the file. Type 'exit' to finish.");

            while (true) {
                System.out.print("Enter food name: ");
                String food = scanner.nextLine();

                if (food.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting and saving food names to the file...");
                    break;
                }

    
                writer.write(food + "\n");
                System.out.println("Food name added!");
            }
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {
            scanner.close();
        }

        System.out.println("All food names have been saved to '" + fileName + "'.");
    }
}
