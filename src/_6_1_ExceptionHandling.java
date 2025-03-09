import java.util.Scanner;
class ValidateTime {
    void checkTime(String str) {
        String[] parts = str.split(":");

        try{
            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);
            int seconds = Integer.parseInt(parts[2]);

            if(parts.length !=3 ){
                throw new Exception("Time should be in format : (HH : MM : SS) ");
            }
            // Checking for hours
            if(hour<0 || hour >23){
                throw new Exception("Hours out of range, it should be between 0 and 23. ");
            }
            // Checking for minutes
            else if (minute < 0 || minute > 59 ){
                throw new Exception("minutes out of range, it should be between 0 and 59. ");
            }
            // Checking for seconds
            else if(seconds < 0 || seconds > 59 ){
                throw new Exception("seconds out of range, it should be between 0 and 59. ");
            }
            else {
                System.out.println("Your Time is correct... " );
            }

        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        };

        }
    }


public class _6_1_ExceptionHandling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Time : ");
        String str = sc.nextLine();
        ValidateTime obj  = new ValidateTime();
        obj.checkTime(str);
    }
}
