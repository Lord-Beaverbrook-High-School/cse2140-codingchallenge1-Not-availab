import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a 4 digit year");
        String input = myScan.next();
        int year = 0;
        int tempNum;
        boolean validInput = true;
        try {
            year = Integer.parseInt(input);
            //to avoid errors if the user inputs letters or a decimal
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid Input");
            validInput = false;
            //tells the user the input was invalid
        }
        if (year > 9999 || year < -9999) {//without this the code would do 1111 1 1 1(imagine the spaces were new lines)
            System.out.println("Invalid Input");
            year = 0;
            validInput = false;
        }
        /* using MATHEMATICAL operations (no Strings), split a year
        Example: if the user enters 1989, the output would be:
        1
        9
        8
        9

         */
        if (validInput) { // so it doesn't print the placeholder if the user inputs an invalid input
            System.out.println("if the number is negative it means it's BCE");//it's true kinda
            tempNum = year / 1000;
            System.out.println(tempNum);
            //gets thousands place digit or first digit of a 4-digit number
            tempNum = (year % 1000) / 100;
            System.out.println(tempNum);
            //gets hundreds place digit or second digit of a 4-digit number
            tempNum = (year % 100) / 10;
            System.out.println(tempNum);
            //gets tens place digit or third digit of a 4-digit number
            tempNum = year % 10;
            System.out.println(tempNum);
            //gets ones place digit or last digit of a 4-digit number
        }
    }
}
//Comment on how you tested the code to make sure it works in all situations
//include tests that you ran