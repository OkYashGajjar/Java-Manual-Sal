import java.io.*;
import java.util.*;

public class _10_1_Program {
    public static void main(String[] args) {
        int char_count = 0, word_count = 0, line_count = 0;
        int wspace_count = 0, alphabet_count = 0, digit_count = 0, special_characters = 0;
        String fname, temp_str;
        StringTokenizer token;

        try {
            // Taking file name input
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter file Path: ");
            fname = br.readLine();

            // Check if file exists before opening it
//            File file = new File(fname);
//            if (!file.exists()) {
//                System.out.println("Error: File not found!");
//                return;
//            }

            br = new BufferedReader(new FileReader(fname));

            // Read file line by line and process text
            while ((temp_str = br.readLine()) != null) {
                line_count++;

                // Count characters, whitespaces, digits, and alphabets
                for (int i = 0; i < temp_str.length(); i++) {
                    if (Character.isWhitespace(temp_str.charAt(i))) {
                        wspace_count++;
                    }
                    if (Character.isDigit(temp_str.charAt(i))) {
                        digit_count++;
                    }
                    if (Character.isLetter(temp_str.charAt(i))) {
                        alphabet_count++;
                    }
                    if(!Character.isWhitespace(temp_str.charAt(i)) && !Character.isDigit(temp_str.charAt(i)) && !Character.isLetter(temp_str.charAt(i)) ){
                        special_characters++;
                    }
                }

                // Count words
                token = new StringTokenizer(temp_str, " ");
                while (token.hasMoreTokens()) {
                    word_count++;
                    char_count += token.nextToken().length();
                }
            }

            // Display Results
            System.out.println("Character count: " + char_count);
            System.out.println("Word Count: " + word_count);
            System.out.println("Line Count: " + line_count);
            System.out.println("Alphabet Count: " + alphabet_count);
            System.out.println("Digit Count: " + digit_count);
            System.out.println("White Space Count: " + wspace_count);
            System.out.println("Special characters Count: " + special_characters);

            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
