import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day;
        int visitTime;
        int lateTime;
        System.out.println("The tax office is open from Sunday to Thursday and closed at Friday and Saturday. ");
        System.out.println("Choose the desired day to visit the tax office: ");
        day = scanner.nextInt();
        if (day <= 0 || day > 5) {
            System.out.println("The day you have chosen is illegal and does not exist.");
            System.exit(0);
        }
        System.out.println("What is the most early hour that you can visit: ");
        visitTime = scanner.nextInt();
        if (day == 1 || day == 2 || day == 4 || day == 5) {
            if (visitTime < 9 || visitTime > 17) {
                System.out.println("The time you have chosen is illegal.");
                System.exit(0);
            }
        }
        System.out.println("What is the most late hour that you can visit: ");
        lateTime = scanner.nextInt();
        if (day == 1 || day == 2 || day == 4 || day == 5) {
            if (lateTime < 9 || lateTime > 17 || lateTime == visitTime || lateTime < visitTime) {
                System.out.println("The time you have chosen is illegal.");
                System.exit(0);

            }
        }
        if (day == 3) {
            if (visitTime < 8 || visitTime > 12 || lateTime == visitTime || lateTime < visitTime) {
                System.out.println("The time you have chosen is illegal.");
                System.exit(0);
            }
        }
        System.out.println("The appointment has been accepted.");

    }
}