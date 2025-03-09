
import java.util.Scanner;
public class NumberOfWords_4_1 {
    public static int countWords(String str) {
        int count = 1;
        if (str == null || str.isEmpty()) {
           return 0;
        }
        for ( int i = 0 ; i < (str.length() -1); i++ )
        {
                if (Character.isWhitespace(str.charAt(i)) && !Character.isWhitespace(str.charAt(i+1))) {
                        count = count + 1;
                }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = s.nextLine();
        int wordCount= countWords(inputString);
        System.out.println("Number of words: " + wordCount);
    }
}