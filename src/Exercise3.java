
import java.util.Scanner;

public class Exercise3{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();
        if ((firstNum <= secondNum) && (secondNum <= thirdNum)) {
            System.out.println(firstNum + "," + secondNum + "," + thirdNum);
        } else if ((secondNum <= firstNum) && (firstNum <= thirdNum))
            System.out.println(secondNum + "," + firstNum + "," + thirdNum);
         else if ((thirdNum <= firstNum) && (firstNum <= secondNum))
            System.out.println(thirdNum + "," + firstNum + "," + secondNum);
        else if ((firstNum >= secondNum) && (secondNum >= thirdNum))
            System.out.println(thirdNum + "," + secondNum + "," + firstNum);

        {
            }

        }
    }