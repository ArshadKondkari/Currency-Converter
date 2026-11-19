
import java.util.*;

public class currencyconverter
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int ch;

        do
        {
            System.out.println("\n===== CURRENCY CONVERTER =====");
            System.out.println("1. Convert INR into Foreign Currency");
            System.out.println("2. Convert Foreign Currency into INR");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    int x;

                    System.out.println("\n1. Convert INR into KWD");
                    System.out.println("2. Convert INR into USD");
                    System.out.println("3. Convert INR into AED");

                    System.out.print("Enter your choice: ");
                    x = sc.nextInt();

                    switch(x)
                    {
                        case 1:
                            System.out.print("Enter amount in INR: ");
                            double a1 = sc.nextDouble();
                            System.out.printf("Converted amount in KWD: %.2f%n", a1 * 0.003324026);
                            break;

                        case 2:
                            System.out.print("Enter amount in INR: ");
                            double a2 = sc.nextDouble();
                            System.out.printf("Converted amount in USD: %.2f%n", a2 * 0.010701139);
                            break;

                        case 3:
                            System.out.print("Enter amount in INR: ");
                            double a3 = sc.nextDouble();
                            System.out.printf("Converted amount in AED: %.2f%n", a3 * 0.039272362);
                            break;

                        default:
                            System.out.println("Invalid Choice!");
                    }
                    break;

                case 2:
                    int y;

                    System.out.println("\n1. Convert KWD into INR");
                    System.out.println("2. Convert USD into INR");
                    System.out.println("3. Convert AED into INR");

                    System.out.print("Enter your choice: ");
                    y = sc.nextInt();

                    switch(y)
                    {
                        case 1:
                            System.out.print("Enter amount in KWD: ");
                            double b1 = sc.nextDouble();
                            System.out.printf("Converted amount in INR: %.2f%n", b1 * 300.84);
                            break;

                        case 2:
                            System.out.print("Enter amount in USD: ");
                            double b2 = sc.nextDouble();
                            System.out.printf("Converted amount in INR: %.2f%n", b2 * 93.448);
                            break;

                        case 3:
                            System.out.print("Enter amount in AED: ");
                            double b3 = sc.nextDouble();
                            System.out.printf("Converted amount in INR: %.2f%n", b3 * 25.4632);
                            break;

                        default:
                            System.out.println("Invalid Choice!");
                    }
                    break;

                case 3:
                    System.out.println("\nThank you for using Currency Converter!");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while(ch != 3);

        sc.close();
    }
}
