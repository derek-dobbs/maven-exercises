import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class UserInputMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.print("Enter Something: ");
        String userEntry = scanner.next();

        System.out.printf("You Entered: \"%s\"", userEntry);

        if(StringUtils.isNumeric(userEntry)) {
            System.out.printf("%n\"%s\" is a number", userEntry);
        }else {
            System.out.printf("%n\"%s\" is not a number", userEntry);
        }

        //Flips the case of the string
        String flippedCase = StringUtils.swapCase(userEntry);
        System.out.printf("%nFlipped Case: %s", flippedCase);

        //Reverses the string
        String reversedString = StringUtils.reverse(userEntry);
        System.out.printf("%nReversed: %s", reversedString);
    }// end main
}// end class
