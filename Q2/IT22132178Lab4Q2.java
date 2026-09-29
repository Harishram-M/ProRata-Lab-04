import java.util.Scanner;

public class IT22132178Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter exam marks (out of 100): ");
        double exam = input.nextDouble();
        if (exam < 0 || exam > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }
        System.out.print("Please enter lab submission marks (out of 100): ");
        double lab = input.nextDouble();
        if (lab < 0 || lab > 100) {
            System.out.println("Invalid input for lab marks. Terminating program.");
            return;
        }
        System.out.print("Please enter the percentage given for the exam: ");
        double examPercentage = input.nextDouble();
        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercentage = input.nextDouble();
        if (examPercentage < 0 || examPercentage > 100
                || labPercentage < 0 || labPercentage > 100
                || Math.abs(examPercentage + labPercentage - 100) > 0.000001) {
            System.out.println("The percentages must add up to 100.");
            return;
        }
        double finalMark = exam * examPercentage / 100
                + lab * labPercentage / 100;
        System.out.println("Final Exam Mark is: " + finalMark);
    }
}
