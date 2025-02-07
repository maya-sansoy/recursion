public class Main {
    public static void main(String[] args) {
        System.out.println(fib(6));
        System.out.println(factorial(5));
        System.out.println(digsum(1234));
        System.out.println("");
        System.out.println(reverseString("hello my name is maya"));
        System.out.println(reverseString("hello"));

        ispalindrome("hello my name is maya");
        ispalindrome("racecar");
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);


    }

    public static int fib(int n) {
        /*int fibn = first + second;
        first = second;
        second = fibn;
        System.out.println(fibn);

        while (n>=0) {
            fibonacci(n-1);
        }

         */

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {

            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int digsum(int n) {
        //1234
        //4 + ds(123)
        //          3 + ds(12)
        //                   2 + ds(1)
        //                           1 + ds(0)
        // = 4 + 3 + 2 + 1
        if (n == 0) {
            return 0;
        }
        return n % 10 + digsum((n - n % 10) / 10);
    }

    public static String reversedString = "";
    public static String reverseString(String string) {



        if (string.length() <= 0) {
            reversedString = "";
            return "";

        }

        reverseString(string.substring(1));

        reversedString += (string.charAt(0));

        return reversedString;
    }
    public static boolean ispalindrome(String string) {
        if (reverseString(string).equals(string)) {
            System.out.println("\"" + string + "\" is a pallindrome!");
            return true;
        }
        else {
            System.out.println("\"" + string + "\" is not a pallindrome!");
            return false;
        }
    }



}