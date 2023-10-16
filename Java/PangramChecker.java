import java.util.Scanner;

public class PangramChecker { //Example :- The quick brown fox jumps over the lazy dog
    public static void main(String[] args) {
        boolean[] alphabetPresent = new boolean[26];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                alphabetPresent[c - 'a'] = true;
            }
        }
        boolean isPangram = true;
        for (boolean letterPresent : alphabetPresent) {
            if (!letterPresent) {
                isPangram = false;
                break;
            }
        }
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
