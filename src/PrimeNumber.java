import java.util.*;

public class PrimeNumber {

    public static Boolean IsPrimeNumber(int number) {
        Boolean isPrime = true;

        if (number <= 1 ) {
            isPrime = false;
        }

        for (int i = 2; i < number ; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime == true) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 0 ; i <= 100 ; i++ ){
            Boolean primeNumber = IsPrimeNumber(i);
            if (primeNumber) {
                System.out.println(i + " is a prime number.");
            } else {
                System.out.println(i + " is not a prime number.");
            }
        }
    }
}
