import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        // Create a HashMap to store the values of Roman numerals
        HashMap<Character, Integer> romanToInteger = new HashMap<>();
        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);

        // Create a Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase(); // Convert input to uppercase

        int result = 0;

        for (int i = 0; i < romanNumeral.length(); i++) {
            int currentDigit = romanToInteger.get(romanNumeral.charAt(i));
            int nextDigit = (i + 1 < romanNumeral.length()) ? romanToInteger.get(romanNumeral.charAt(i + 1)) : 0;

            if (currentDigit < nextDigit) {
                result -= currentDigit;
            } else {
                result += currentDigit;
            }
        }

        System.out.println("The integer equivalent is: " + result);
    }
}
