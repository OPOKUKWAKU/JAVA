import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your exam score: ");
        int examScore = scanner.nextInt();
        System.out.print("Enter your assessment score: ");
        int assessmentScore = scanner.nextInt();
        System.out.print("Have you paid your fees(Enter 100 for full): ");
        int feesPaid = scanner.nextInt();

        boolean passedBoth = examScore >= 25 && assessmentScore >= 15;
        boolean studentCondoned = examScore + assessmentScore >= 39;
        boolean studentPaid = feesPaid == 100;
        boolean failedExam = examScore < 25;
        boolean failedAssessment = assessmentScore < 15;
        boolean studentRepeated = examScore < 25 && assessmentScore < 15;

        scanner.close();

        if (passedBoth || studentCondoned) {
            if (studentPaid) {
                System.out.println("You will get your certificate");
            } else {
                System.out.println("You will not get your certificate");
            }

        } else {
            if (failedExam)
                System.out.println("You failed the exams");
        }
        if (failedAssessment) {
            System.out.println("You failed the assessment");
        }
        if (studentRepeated) {
            System.out.println("You are repeated");
        }
    }
}