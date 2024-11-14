import java.util.Scanner;

public class IT24104068Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        if (number >= 10000 && number <= 99999) {
            for (char digit : Integer.toString(number).toCharArray()) {
                System.out.print(digit + " ");
            }
        } else {
            System.out.println("Please enter a valid five-digit number.");
        }

        scanner.close();
    }
}