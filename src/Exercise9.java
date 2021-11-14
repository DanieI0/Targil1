import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) { // Main
        int positiveNum = getPositiveNumber();
        checkRemnant(positiveNum, positiveNum);
        checkPrime(positiveNum);
        for (int i = 3; i < positiveNum; i++) {
            if (checkPrime(i)) {
                System.out.print(i + ",");
            }
        }
    }


    public static boolean checkRemnant(int a, int b) { // 1st function
        return a % b == 0;
    }

    public static boolean checkPrime(int a) { // 2nd function

boolean value = true;
        for (int i = 2; i < a; i++) {
            if (checkRemnant(a, i)) {
                value = false;
            }
        }
        return value;
    }

        public static int getPositiveNumber () { // 3rd function
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            if (num < 0) {
                do {
                    System.out.println("The number you entered is not positive, try again");
                    num = scanner.nextInt();
                }
                while (num < 0);
            }
            return num;
    }
}