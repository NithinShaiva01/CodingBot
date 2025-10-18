package A;
import java.util.Scanner;

public class DuplicateCharacters {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input candidate name
	        System.out.print("Enter candidate name: ");
	        String name = sc.nextLine();

	        String result = "";
	        
	        // Loop through each character
	        for (int i = 0; i < name.length(); i++) {
	            char c = name.charAt(i);
	            // Add character to result if it is not already present
	            if (result.indexOf(c) == -1) {
	                result += c;
	            }
	        }

	        // Display result
	        System.out.println("Name after removing duplicates: " + result);
	    }
	}

//OUTPUT
//Enter candidate name: NithinShaiva
//Name after removing duplicates: NithnSav