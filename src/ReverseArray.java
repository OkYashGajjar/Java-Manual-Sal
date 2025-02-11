import java.util.Scanner;

public class ReverseArray {

    public static void ReverseNumbers(int[] numbers) {
        int[] reversedNumbers = new int[10];
        int traverse = 0;
        // for reversing an array.
        for ( int i = (numbers.length-1);  i >= 0 ;  i-- ){
            reversedNumbers[i] = numbers[traverse];
            traverse++;
        }
        // for printing a reversed array.
        for ( int i = 0 ; i < reversedNumbers.length ; i ++) {
            System.out.print(reversedNumbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arrayNumbers = new int[10];
        Scanner sc = new Scanner(System.in);
        // adding an elements to the array.
        for( int i = 0 ; i < 10 ; i++) {
            System.out.print("Enter " + (i + 1) + " number : ");
            arrayNumbers[i] = sc.nextInt();
        }
        //Calling method to revese the ArrayNumbers.
        System.out.print("Reversed Numbers Is : ");
        ReverseNumbers(arrayNumbers);
    }

}
