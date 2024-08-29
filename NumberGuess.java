import java.util.Scanner;  
public class NumberGuess {  
    public static void playGame() {  
        Scanner scanner = new Scanner(System.in);  
        int secretNumber = 1 + (int)(100 * Math.random());  
        int maxAttempts = 5;  
        int attempts = 0;
        int guess = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");  
        System.out.println("A number has been chosen between 1 and 100.");  
        System.out.println("Your task is to guess the number within 5 attempts.");  
        
        while (attempts < maxAttempts) {  
            System.out.println("Attempt " + (attempts + 1) + ": Enter your guess:");
            guess = scanner.nextInt();
            
            if (guess == secretNumber) {  
                System.out.println("Wow, you guessed it!");  
                break;
            } else if (guess < secretNumber) {  
                System.out.println("Oops, too low! Try a higher number.");  
            } else {  
                System.out.println("Oops, too high! Try a lower number.");
            }
            
            attempts++;
        }
        
        if (attempts == maxAttempts && guess != secretNumber) {  
            System.out.println("Sorry, you didn't guess it. The number was " + secretNumber);
        }
    }  
    
    public static void main(String args[]) {  
        playGame();  
    }  
}
