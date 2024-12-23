package lvl5week3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteStudentData {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "students.csv";

        try (FileWriter writer = new FileWriter(fileName)) {
            // Writing header to the CSV file
            writer.append("ID,Name,Age,Grade\n");

            System.out.print("Enter the number of students to store: ");
            int numberOfStudents = scanner.nextInt();

            // Writing student data
            for (int i = 1; i <= numberOfStudents; i++) {
                System.out.println("Enter details for student " + i + ":");
                System.out.print("ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Age: ");
                int age = scanner.nextInt();
                System.out.print("Grade (A-F): ");
                char grade = scanner.next().charAt(0);

                // Append student data to the CSV file
                writer.append(id + "," + name + "," + age + "," + grade + "\n");
            }

            System.out.println("Student data successfully written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
