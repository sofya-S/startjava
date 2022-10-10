import java.util.Scanner;
public class GuessTheNumber{

	public static void main(String[] args) {
        int random = (int)(Math.random()*100+1);
        while(true){
		    Scanner sc = new Scanner(System.in);
            System.out.print("Enter your guess (1 to 100): ");
            int guess = sc.nextInt();
            if(guess > random){
                System.out.println("Your guess is too big");
            } else if(guess < random){
                System.out.println("Your guess is too small");
            } else {
                System.out.println("You win!");
                break;
            }
        }        
	}
}
