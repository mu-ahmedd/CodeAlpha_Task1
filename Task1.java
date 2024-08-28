import java.util.Scanner;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("Enter the number of students: ");
        int numofstuds = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numofstuds; i++) {
            System.out.println("Enter the name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            names.add(name);

            System.out.println("Enter the marks of student " + (i + 1) + ": ");
            double value = scanner.nextDouble();
            scanner.nextLine();
            grades.add(value);
        }

        double sum = 0;
        double max = grades.get(0);
        double min = grades.get(0);

        for (double value : grades) {
            sum = sum + value;
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }

        double Avg = sum / grades.size();
        System.out.println("Average marks: " + Avg);
        System.out.println("Highest marks: " + max);
        System.out.println("Lowest marks: " + min);

        // Print student names and grades
        for (int i = 0; i < numofstuds; i++) {
            System.out.print("Student: " + names.get(i) + ", Marks: " + grades.get(i));
            double mark = grades.get(i);
            String grade;
            switch ((int) Math.round(mark/10)) {
                case 9:
                grade = "A";
                break;
                case 8:
                grade = "B";
                break;
                case 7:
                grade = "C";
                break;
                case 6:
                grade = "D";
                break;

                default:
                 grade = "F";
                    break;

            }
            System.out.println(", Grade: " + grade);
        }

    }
}