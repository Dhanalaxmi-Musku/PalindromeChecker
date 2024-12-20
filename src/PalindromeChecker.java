import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        Deque<Character> deque = new Deque<>();
        System.out.println("Is string palindrome?");
        for (char ch : input.toCharArray()) {
            deque.addRear(ch);
        }

        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (!deque.removeFront().equals(deque.removeRear())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}