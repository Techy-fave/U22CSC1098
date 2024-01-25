import java.util.Scanner;

public class TwoDigitCalculators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Two-Digit Calculator");
        System.out.print("Enter the first two-digit number: ");
        int num1 = getTwoDigitNumber(scanner);

        System.out.print("Enter the second two-digit number: ");
        int num2 = getTwoDigitNumber(scanner);

        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = getOperationChoice(scanner);

        performCalculation(num1, num2, choice);

        scanner.close();
    }

    private static int getTwoDigitNumber(Scanner scanner) {
        int number;
        do {
            System.out.print("Enter a two-digit number: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a two-digit number: ");
                scanner.next(); // consume the non-integer input
            }
            number = scanner.nextInt();
        } while (number < 10 || number > 99);

        return number;
    }

    private static int getOperationChoice(Scanner scanner) {
        int choice;
        do {
            System.out.print("Enter your choice (1-4): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number between 1 and 4: ");
                scanner.next(); // consume the non-integer input
            }
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 4);

        return choice;
    }

    private static void performCalculation(int num1, int num2, int choice) {
        int result;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result of addition: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result of subtraction: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result of multiplication: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result of division: " + result);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please choose a number between 1 and 4.");
        }
    }
}
