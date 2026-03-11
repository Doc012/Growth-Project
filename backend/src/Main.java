import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.print("===========================\n" +
                    "___//CALCULATOR\\\\___\n" +
                    "Enter the option you want to use:\n" +
                    "1. Addition\n" +
                    "2. Subtraction\n" +
                    "3. Multiplication\n" +
                    "4. Division\n" +
                    "5. Exit\n=>"
                    );
            int choice = scanner.nextInt();

            // Slender, Inside the switch cases, before the break:

            
            
            switch (choice){
                case 1:
                    /* Slender: Collect two numbers and print something like
                     "You entered: 7 and 3, We'll calculate later."
                     */
                    System.out.print("Enter the first number: ");
                    double number1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double number2 = scanner.nextDouble();
                    System.out.println(number1 + " and " + number2);
                    System.out.println("Addition coming soon...\n");
                    break;
                case 2:
                    // Even here
                	System.out.print("Enter the first number: ");
                    double num = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double numb2 = scanner.nextDouble();
                    System.out.println(num + " and " + numb2);
                    System.out.println("Subtraction coming soon...\n");
                    break;
                case 3:
                    // And here
                	System.out.print("Enter the first number: ");
                    double digit1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double digit2 = scanner.nextDouble();
                    System.out.println(digit1 + " and " + digit2);
                    System.out.println("Multiplication coming soon...\n");
                    break;
                case 4:
                    // And here
                	System.out.print("Enter the first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double num2 = scanner.nextDouble();
                    System.out.println(num1 + " and " + num2);
                    System.out.println("Division coming soon...\n");
                    break;
                case 5:
                    System.out.println("Thank you, bye...\n");
                    running = false;
                    break;
                default:
                    System.out.println("Incorrect option...\n");
            }
        }
        scanner.close();
    }
}