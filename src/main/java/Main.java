public class Main {
    static void main() {

    }

    //Aufgabe 1 – sum()
    public static int sum(int a, int b) {
        return a + b;
    }

    //Aufgabe 2 – isEven()
    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    //Aufgabe 3 – getFirstCharacter()
    public static String getFirstCharacter(String text) {
        if (text == null || text.isBlank()) return null;
        return String.valueOf(text.charAt(0));
    }

    //Level 2: Medium
    //Aufgabe 4 – reverseString()
    public static String reverseString(String input) {
        if (input == null || input.isBlank()) return null;

        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output += input.charAt((input.length() - 1) - i);
        }
        return output;
    }

    //Aufgabe 5 – isPalindrome()
    public static boolean isPalindrome(String text) {
        return text.equalsIgnoreCase(reverseString(text));
    }

    //Aufgabe 6 – countVowels()
    public static int countVowels(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            switch (Character.toLowerCase(text.charAt(i))) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
            }
        }
        return count;
    }

    //Level 3: Bonus
    //Aufgabe 7 – factorial()
    public static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException();

        int factorialValue = 1;
        for (int i = 1; i <= n ; i++) {
            factorialValue *= i;
        }

        return factorialValue;
    }

    //Aufgabe 8 – fibonacci()
//    public static int fibonacci(int n) {
//
//        if (n == 0 || n == 1) return n;
//
//        int fibonacciFrom0 = 0;
//        int fibonacciFrom1 = 1;
//
//        int fibonacciNMinus2 = fibonacciFrom0;
//        int fibonacciNMinus1 = fibonacciFrom1;
//        int fibonacciValue = fibonacciNMinus1 + fibonacciNMinus2;
//
//        for (int i = 2; i <= n; i++) {
//            fibonacciValue = fibonacciNMinus1 + fibonacciNMinus2;
//
//            fibonacciNMinus2 = fibonacciNMinus1;
//            fibonacciNMinus1 = fibonacciValue;
//        }
//        return fibonacciValue;
//    }

    public static int fibonacci(int n) {

        if (n < 0) throw new IllegalArgumentException();
        if (n == 0 || n == 1) return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }

    //Aufgabe 9 – mergeArrays()
    public static int[] mergeArrays(int[] a, int[] b) {

        int[] resultArray = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            resultArray[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            resultArray[i + a.length] = b[i];
        }

        return resultArray;
    }

}
