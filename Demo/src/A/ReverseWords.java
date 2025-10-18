package A;
import java.util.Scanner;

public class ReverseWords {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string from user
	        System.out.print("Enter a sentence: ");
	        String sentence = sc.nextLine();

	        // Split sentence into words
	        String[] words = sentence.split(" ");

	        // Reverse the words
	        String reversed = "";
	        for (int i = words.length - 1; i >= 0; i--) {
	            reversed += words[i] + " ";
	        }

	        // Trim trailing space
	        reversed = reversed.trim();

	        // Display result
	        System.out.println("Reversed sentence: " + reversed);
	    }
	}

//OUTPUT
//Enter a sentence: I work for iqm
//Reversed sentence: iqm for work I