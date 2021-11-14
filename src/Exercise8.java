import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        int num = enterNumber();
      buildStruct(num);

    }

    public static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a number in the range of 5 to 20");
            num = scanner.nextInt();
        }
        while (num < 5 || num > 20);

        return num;
    }

    public static void buildStruct(int userNum) {
        String str = "*";
        for (int j = 0; j < userNum; j++) {
        for (int i = 0; i <= j; i++) {
                System.out.print(str);
            }
            System.out.println();
        }
    }
}
