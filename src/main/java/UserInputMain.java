import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class UserInputMain {
    public static void main(String[] args) {
//        System.out.println("Test UserInput class");
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.print("Enter something: ");
        String userEntry = scanner.next();
        System.out.println("You entered: " + userEntry);

        //Tells whether or not what the user entered is a number
        //IsAlpha/IsNumeric/IsWhitespace/IsAsciiPrintable - checks the characters in a String, use isNumeric
        if(StringUtils.isNumeric(userEntry)) {
            System.out.println(userEntry + " is a number");
        }else {
            System.out.println(userEntry + " is not a number.");
        }

        //Flips the case of the string
        //Reverses the string
    }// end main
}// end class
