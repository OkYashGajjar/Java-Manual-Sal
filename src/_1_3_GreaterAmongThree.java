import java.util.Scanner;

public class _1_3_GreaterAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int num1 = sc.nextInt();
        System.out.print("Enter Second number :");
        int num2 = sc.nextInt();
        System.out.print("Enter Third number :");
        int num3 = sc.nextInt();


//         finds greater among three by ternary method.
//         int greater = (num1 >= num2 && num1 >= num3)? num1 : (num2 >= num1 && num2 >= num3)? num2 : num3;
//         System.out.println(greater + " is Greater.");

        int greater;

        if (num1 >= num2) {
            if (num1 >= num3) {
                greater = num1;
            } else {
                greater = num3;
            }
        } else { // num2 < num1
            if (num2 >= num3) {
                greater = num2;
            } else {
                greater = num3;
            }
        }
        System.out.println(greater + " is greater. ");
    }
    }

