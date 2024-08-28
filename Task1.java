import java.util.Scanner;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("Enter the number students: ");
        int numofstuds = scanner.nextInt();

        for (int i = 0; i < numofstuds; i++) {
            System.out.println("Enter the grade of student " + (i + 1) + ": ");
            double value = scanner.nextDouble();
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
            if (min < value) {
                min = value;
            }
        }

        double Avg = sum / grades.size();
        System.out.println("Average grade: " + Avg);
        System.out.println("Highest grade: " + max);
        System.out.println("Lowest grade: " + min);

    }
}
