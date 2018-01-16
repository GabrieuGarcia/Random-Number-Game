import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int randomNumber = (int) ((Math.random() * 100) + 1);

        System.out.println("Guess a number 1 to 100");
        for (int i = 9; i > -1; i--) {
            Scanner scanner = new Scanner(System.in);
            int guess = scanner.nextInt();

            if (guess > randomNumber) {
                System.out.println("The number is lower than " + guess + " - you have " + i + " tries");
            }

            if (guess < randomNumber) {
                System.out.println("The number is bigger than " + guess + " - you have " + i + " tries");
            }

            if (guess == randomNumber) {
                System.out.println("CONGRATULATIONS YOU WON, the number is " + guess);
                return;
            }
            if(i == 0){
                System.out.println("Sorry you lose!");
                return;
            }
        }

    }

}
