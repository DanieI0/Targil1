import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1 + (int) (Math.random() * 1000);
        int userOne = 0;
        int userTwo = 0;
        int tries = 0;

        System.out.println("Guess the random number I've chosen from 1 to 1000.");
        while (userOne != num || userTwo != num) {
            tries++;
            System.out.println("Player1's turn:" );
            userOne = scanner.nextInt();
            if (num < userOne) {
                System.out.println("Guess is higher than number ");
            }else if (num == userOne) {
                break;
            } else {
                System.out.println("Guess is lower than number");
            }
            System.out.println("Player2's turn: ");
            userTwo = scanner.nextInt();
            if (num < userTwo) {
                System.out.println("Guess is higher than number ");
            }else if (num == userTwo) {
                    break;
            } else {
                System.out.println("Guess is lower than number");
            }
        }
        if (userOne == num) {
            System.out.println("Player1 has won with " + tries + " tries");
        } else if (userTwo == num)
            System.out.println("Player2 has won with " + tries + " tries");
        }
}
