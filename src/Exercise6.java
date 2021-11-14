import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number of the sequence: ");
        int firstNumOfSeq = scanner.nextInt();
        System.out.println("Enter the difference between the numbers of the sequence: ");
        int seqDiff = scanner.nextInt();
        System.out.println("Enter the amount of numbers you want in the sequence: ");
        int totalNum = scanner.nextInt();

       do{
           if (totalNum > 0){
               break;
           }
            System.out.println("This number cannot be used,try again.");
            System.out.println("Enter the amount of numbers you want in the sequence: ");
            totalNum = scanner.nextInt();

       } while(totalNum <= 0);
        getSequenceInfo(firstNumOfSeq, seqDiff, totalNum);
    }


    public static void getSequenceInfo(int aNum, int diff, int total) {
        for (int i = 0; i<total; i++) {

            System.out.print(aNum + ",");
            aNum = aNum + diff;

        }
    }
}