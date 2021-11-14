import java.util.Scanner;

public class Exercise1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a random number: ");
        int randomNum = scanner.nextInt();
        if (randomNum < 0 ) {
            randomNum = randomNum * -1;
        }
            System.out.println(randomNum);
    }
}