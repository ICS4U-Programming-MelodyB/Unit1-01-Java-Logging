import java.util.Scanner;

/**
* This program receives the length of logs from user.
* From information given, it calculates how much the truck would be able,
* to contain, with usage of try catch, etc.
*
* @author  Melody Berhane
* @version 1.0
* @since   2023-2-16
*/
public final class Logging {

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private Logging() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {

        // Constant
        final double LOG_WEIGH = 20;
        final double TOT_MASS = 1100;
        final double OP_ONE = 0.25;
        final double OP_TWO = 0.5;
        final double OP_THREE = 1;

        // Using Scanner for Getting Input for User
        final Scanner scanner = new Scanner(System.in);

        // Gets input from user
        System.out.print("Enter log length (0.25, 0.5, 1): ");
        final String lengthStr = scanner.nextLine();

        try {
            // Convert the string to a double
            final double lengthFlt = Double.parseDouble(lengthStr);

            // If input is valid calculates the # of logs.
            if (lengthFlt == OP_ONE || lengthFlt == OP_TWO
                     || lengthFlt == OP_THREE) {
                // Calculate the num of logs
                final double numLogs = LOG_WEIGH * lengthFlt;
                final double finalNumLogs = TOT_MASS / numLogs;

                // Display the answer to user
                System.out.print("The truck can take, " + finalNumLogs);
                System.out.print(" logs that are " + lengthStr);
                System.out.println(" meters in length");
            } else {
                System.out.println("Please enter a valid length");
            }
        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid length. "
                + error.getMessage());
        }
    }
}
