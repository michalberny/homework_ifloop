package com.engeto.examples.homework_ifloop;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //region Demo
    /**
     * Example of use of {@link Support#safeReadInt()}
     *
     * Read one integer from input and print it to output
     * @return integer from input
     */
    public static void readOneIntFromInputAndPrintIt() {
        int input = Support.safeReadInt();
        System.out.println("You entered: "+input);
    }
    //endregion

    //region Loops
    /**
     * Read integers from input and print them until negative
     * input.
     */
    public static void readIntsFromInputAndPrintItUntilNegative() {

        boolean notNegative = true;
        while (notNegative) {
            System.out.print("Enter input number: ");
            int input = Support.safeReadInt();
            System.out.println("You entered: "+input);

            if (input < 0) {
                System.out.println("You entered negative value.");
                notNegative = false;
            }
        }
    }

    /**
     * Sum all input numbers (negative number terminates reading) and return result.
     * @return Sum of input numbers expect of terminating negative number.
     */
    public static int sumAllInputUntilNegative() {
        boolean notNegative = true;
        int sum = 0;
        while (notNegative) {
            System.out.print("Enter input number: ");
            int input = Support.safeReadInt();
            System.out.println("You entered: "+input);

            if (input < 0) {
                System.out.println("You entered negative value.");
                notNegative = false;
            }
            sum = sum + input;
        }
        return sum;
    }

    /**
     * Store all input numbers in a list (negative number terminates reading).
     * @return List of read values (terminating negative value is NOT included)
     */
    public static List storeAllInputInArrayListUntilNegative() {
        boolean notNegative = true;
        List<Integer> list = new ArrayList<>();

        while (notNegative) {
            System.out.print("Enter input number: ");
            int input = Support.safeReadInt();
            System.out.println("You entered: "+input);

            if (input < 0) {
                System.out.println("You entered negative value.");
                notNegative = false;
            }
            list.add(input);

        }
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) < 0) list.remove(i);
        }
        return list;
    }

    /**
     * Print all integers from given list.
     * @param list List of integers to print.
     */
    public static void printAllIntegersFromList(List<Integer> list) {
        System.out.println(list);
    }

    public static Integer sumAllIntegersFromList(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum = sum + i;
        }
        return sum;
    }
    //endregion

    //region Conditions
    /**
     * Print integers from given list that are smaller than given limit.
     * @param limit Limit - only smaller integers are printed
     * @param list List of integers to print.
     */
    public static void printIntegersUnderLimit(List<Integer> list, int limit) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < limit) {
                System.out.print(list.get(i) + " ");
            }
        }
        System.out.println();
    }

    /**
     * Print integers from given list. Replace 1 by "one", 2 by "two", 3 by "tři" - print others with no change.
     * @param list List of integers to print.
     */
    public static void printIntegersWithReplace(List<Integer> list) {
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == 1) {
                System.out.print("one" + " ");
            }
            else if (list.get(i) == 2) {
                System.out.print("two" + " ");
            }
            else if (list.get(i) == 3) {
                System.out.print("three" + " ");
            }
            else System.out.print(list.get(i) + " ");
        }
    }
    //endregion

    public static void main(String[] args) {
        // Example
        //System.out.println("--- Example - read and print one integer ---");
        //System.out.print("Enter input number: ");
        //readOneIntFromInputAndPrintIt();
        // ---
        //System.out.println("--- Task 1 - read and print integers until negative ---");
        //readIntsFromInputAndPrintItUntilNegative();
        // ---
        //System.out.println("--- Task 2 - sum all integers until negative ---");
        //System.out.println("Total sum: " + sumAllInputUntilNegative());;
        // ---
        System.out.println("--- Task 3 - read integers to list until negative ---");
        List<Integer> list = storeAllInputInArrayListUntilNegative();
        System.out.println(list);
        // ---
        System.out.println("--- Task 4 - print all integers from list ---");
        printAllIntegersFromList(list);
        // ---
        System.out.println("--- Task 5 - sum all integers in list ---");
        System.out.println("Total sum: " + sumAllIntegersFromList(list));
        // ---
        System.out.println("--- Task 6 - print integers under 5 from list ---");
        printIntegersUnderLimit(list, 5);
        // ---
        System.out.println("--- Task 7 - print integers - replace: 1 => \"one\", 2 => \"two\", 3 => \"three\" ---");
        printIntegersWithReplace(list);
    }
}
