import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int subject1, subject2, subject3, subject4, subject5;

        System.out.println("Enter the marks for Subject 1: ");
        subject1 = scanner.nextInt();
        
        System.out.println("Please enter the marks for Subject 2: ");
        subject2 = scanner.nextInt();
        
        System.out.println("Marks for Subject 3: ");
        subject3 = scanner.nextInt();
        
        System.out.println("Now, input the marks for Subject 4: ");
        subject4 = scanner.nextInt();
        
        System.out.println("Finally, enter the marks for Subject 5: ");
        subject5 = scanner.nextInt();
        
        int totalMarks = 0;
        totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        
        System.out.println("Total Marks Obtained: " + totalMarks);
        
        float averagePercentage;
        averagePercentage = totalMarks / 5.0f;
        
        System.out.println("Your Average Percentage is: " + averagePercentage + "%");

        char grade = 'F';
        
        if (averagePercentage >= 90 && averagePercentage <= 100) {
            grade = 'A';
        } else if (averagePercentage >= 80 && averagePercentage < 90) {
            grade = 'B';
        } else if (averagePercentage >= 70 && averagePercentage < 80) {
            grade = 'C';
        } else if (averagePercentage >= 60 && averagePercentage < 70) {
            grade = 'D';
        } else if (averagePercentage >= 50 && averagePercentage < 60) {
            grade = 'E';
        } else if (averagePercentage < 50 && averagePercentage >= 0) {
            grade = 'F';
        } else {
            System.out.println("Invalid Percentage, something went wrong.");
        }
        
        System.out.println("The Grade you received is: " + grade);

        scanner.close();
    }
}
