package nyc.c4q;

/**
 * Created by Millochka on 1/22/17.
 */
public class Recursion {

    public static void main(String[] args) {

        //count(10);
        System.out.print(isEvenWord("appeases"));

    }

    public static int count(int x) {

        if (x == 1) {

            System.out.println(x);
            return 0;
        } else {

            System.out.println(x);
            return count(x - 1);
        }
    }

    public static String changeXY(String input) {

        if (input == null) {
            return null;
        } else if (input.length() == 1 && input.equals("x")) {
            return "y";


        } else if (input.length() == 1) {

            return input;
        } else {

            return changeXY(input.substring(0, 1)) + changeXY(input.substring(1));

        }

    }

    public static String removeDuplicates(String input) {
        if (input == null) {
            return null;
        } else if (input.length() == 1) {
            return input;
        } else {

            if (input.substring(0, 1).equals(input.substring(1, 2))) {
                return removeDuplicates(input.substring(1));
            } else {
                return input.substring(0, 1) + removeDuplicates(input.substring(1));
            }

        }
    }

    public static Boolean isEvenWord(String input) {
        if (input == null || input.isEmpty()) {
            return true;
        } else if (input.length() == 1) {
            return false;

        } else {
            if (input.substring(1).contains(input.substring(0, 1))) {
                int index = input.substring(1).indexOf(input.substring(0, 1));

                StringBuilder tempStr = new StringBuilder(input.substring(1));
                tempStr.deleteCharAt(index);

                return isEvenWord(tempStr.toString());
            } else {
                return false;
            }
        }

    }
}
