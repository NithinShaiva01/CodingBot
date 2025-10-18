package A;
import java.util.Scanner;

public class CountRepeatedCharacters {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        // Input character to find
	        System.out.print("Enter a character to find: ");
	        char ch = sc.next().charAt(0);

	        // Convert both string and character to lowercase
	        str = str.toLowerCase();
	        ch = Character.toLowerCase(ch);

	        int count = 0;

	        // Count occurrences
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == ch) {
	                count++;
	            }
	        }

	        // Display result
	        System.out.println("The character '" + ch + "' occurs " + count + " times (case-insensitive).");
	    }
	}