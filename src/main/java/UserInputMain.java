import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class UserInputMain {
    public static void main(String[] args) {
//        System.out.println("Test UserInput class");
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.print("Enter something: ");
        String userEntry = scanner.next();
//        System.out.println("You entered: " + userEntry);
        System.out.printf("You entered \"%s\"", userEntry);

        //Tells whether or not what the user entered is a number
        //IsAlpha/IsNumeric/IsWhitespace/IsAsciiPrintable - checks the characters in a String, use isNumeric
        if(StringUtils.isNumeric(userEntry)) {
//            System.out.println(userEntry + " is a number");
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
