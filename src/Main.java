/* psuedocode idea:
prompt to enter FULL operation, using * / + -
get full string (in println state no letters only numbers parentheses and operations)
rid of all other characters like letters, spaces, colons, commas, semi colons, etc etc
recognize if dividing by zero, return syntax error and reprompt
-(get to this later)-recognize if any decimals or real long numbers, replace with doubles floats or longs or sm
recognize parenthesis and replace with *

consolidate string to a "readable" string
traverse string w substring and properly assign integers to an array
traverse string w substring assign operations to an array (should have one less items in list than integer, if not then return syntax error and return prompt)
prioritize multiplication and division, from left to right, two terms or integers at a time, by traversing the operations and finding the first / or * maybe using switch case break? idk then get the two terms associated with the operation and do that operation. use method parameters or like temp variables  to get the index of arrays or something idk then replace the result back into the array of integers then remove the used operation
repeat until all * and / cannot be found
then do the same with + and -
return result
reprompt
 */




import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String[] integerList;
        String[] operationsList;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the FULL operation:");
        String userInput = in.nextLine();

    }


    static String cleanList(String input) { // also replace parentheses with multiplication here

    }
    static boolean checkForDivideByZero() {

    }
    static int[] integerList(String input) { // if you take input string and just remove the appended ints then you can just get a list of clean operations

    }
    static String[] operationList(String input) {

    }
    static int[] md() { // multiplication and division

    }
    static int as() { // addition and subtraction, final operation so it should just return one number instead of an array :D

    }
}
