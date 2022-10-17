import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        int random = (int) (Math.random() * 100 + 1);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess (1 to 100): ");
        int guess = sc.nextInt();
        while(random != guess) {
            if(guess > random) {
                System.out.println("Your guess is too big");
            } else if(guess < random) {
                System.out.println("Your guess is too small");
            }
            System.out.print("Enter your guess (1 to 100): ");
            guess = sc.nextInt();            
        } 
        System.out.println("You win!");       
    }
}
