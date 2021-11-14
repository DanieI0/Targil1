import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A: ");
        double a = scanner.nextDouble();
        System.out.println("B: ");
        double b = scanner.nextDouble();
        System.out.println("C: ");
        double c = scanner.nextDouble();
        double determinant = (Math.pow(b,2)) - (4*a*c);
        double squareRoot =  Math.sqrt(determinant);
        if (determinant > 0) {
            System.out.println("X1: " + (-b + squareRoot)/(2*a));
            System.out.println("X2: " + (-b - squareRoot)/(2*a));
        } else if (determinant == 0) {
            System.out.println("This equation has only one answer: " + (-b + squareRoot) / (2 * a));
        } else if (determinant < 0) {
            System.out.println("An answer has not been found for this equation.");
            }

                }


}
