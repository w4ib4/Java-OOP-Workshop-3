package lvl5week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReadAndSort {

    public static void main(String[] args) {
        String fileName = "students.csv";
        List<Student> students = new ArrayList<>();

        // Reading data from the CSV file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine(); // Skipping the header line

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(","); // Splitting the line by commas
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                char grade = data[3].charAt(0);

                // Adding the student to the list
                students.add(new Student(id, name, age, grade));
            }

            System.out.println("Student data successfully read from " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        // Sorting students by grade
        students.sort(Comparator.comparing(Student::getGrade));

        // Displaying the sorted list of students
        System.out.println("\nStudents sorted by grade:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

