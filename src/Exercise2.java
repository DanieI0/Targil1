
import java.util.Scanner;

public class Exercise2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int sumOfBoth = firstNum + secondNum;
        if (sumOfBoth % 2 == 0) {
            System.out.println("The sum of both numbers is even");
        }else
            System.out.println("The sum of both numbers is odd");
        {
        }

    }
}