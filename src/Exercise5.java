
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userChoice;
        int employeeType;
        do {
            System.out.println("Choose the Employee type:");
            System.out.println("Junior Employee - 0");
            System.out.println("Senior Employee - 1");
            employeeType = scanner.nextInt();
        }
        while (employeeType > 1 || employeeType < 0);


        System.out.println("Amount of hours the Employee had worked this past month: ");
        int workingHours = scanner.nextInt();
        System.out.println("Amount of times the Employee had reached his daily task: ");
        int dailyTask = scanner.nextInt();
        System.out.println("This month's salary for the Employee is " + calcSalary(employeeType, workingHours, dailyTask));

        System.out.println("Would you like to calculate another Employee's salary?");
        System.out.println("1 - Yes");
        System.out.println("0 - No");
        userChoice = scanner.nextInt();
        if (userChoice == 1)
            main(null);
        else
            System.exit(0);
    }

            public static int calcSalary(int employeeType, int hours, int daily) {
                int juniorPay = 50;
                int seniorPay = 200;
                int bonusPay = 250;
                int monthlySalary = 0;
                if (employeeType == 0) {
                    monthlySalary = juniorPay * hours + (bonusPay * daily);
                }  else if (employeeType == 1)
                    monthlySalary = seniorPay * hours + (bonusPay * daily);
                return monthlySalary;
            }

}