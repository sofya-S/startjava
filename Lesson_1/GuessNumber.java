import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        int random = (int) (Math.random() * 100 + 1);
        Scanner sc = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Enter your guess (1 to 100): ");
            guess = sc.nextInt();
            if(guess > random) {
                System.out.println("Your guess is too big");
            } else if(guess < random) {
                System.out.println("Your guess is too small");
            }
        } while(random != guess);
        System.out.println("You win!");     
    }
}