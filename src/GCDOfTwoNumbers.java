import java.util.ArrayList;
import java.util.Scanner;

public class GCDOfTwoNumbers {

    public static void GCD ( int n1, int n2) {
        int higher;
        ArrayList<Integer> gcdList = new ArrayList<>();
        // Finds highest from 2 numbers
        if (n1 >= n2) {
            higher = n1;
        }
        else {
            higher = n2;
        }
        // traverse till highest and returns common numbers from which that 2 numbers are divisible.
        for (int i = 1 ; i <= higher ; i ++ ){
            if (n1 % i == 0 && n2 % i == 0){
                gcdList.add(i);
            }
        }
        //Finds the greatest common divisible number.
        int gcdLastElement = gcdList.get(gcdList.toArray().length -1 );
        System.out.print("The GCD of " + n1 + " &" + n2 + " is " + gcdLastElement);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number :");
        int num2 = sc.nextInt();

        GCD(num1, num2);
    }
}
