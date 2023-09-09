import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = input.nextInt();
        input.nextLine(); // Consume the newline character

        String[] subjectNames = new String[numSubjects];
        double[] subjectMarks = new double[numSubjects];
        double totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the name of Subject " + (i + 1) + ": ");
            subjectNames[i] = input.nextLine();

            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            subjectMarks[i] = input.nextDouble();
            totalMarks += subjectMarks[i];
            input.nextLine(); // Consume the newline character
        }

        double averagePercentage = totalMarks / numSubjects;

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nSubject-wise Details:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.println(subjectNames[i] + ": " + subjectMarks[i] + " marks");
        }

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        input.close();
    }
}
