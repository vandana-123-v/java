import java.util.Arrays;
import java.util.Scanner;

public class PalindromeAndSorting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------------------------------
        // i. Check Palindrome
        // -------------------------------
        System.out.print("Enter a string to check palindrome: ");
        String str = sc.nextLine();

        String original = str;
        String reversed = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        // -------------------------------
        // ii. Sort List of Names
        // -------------------------------
        System.out.print("\nEnter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();  // consume newline

        String[] names = new String[n];

        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        // Sorting in ascending order
        Arrays.sort(names);

        System.out.println("\nNames in Ascending Order:");
        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}
