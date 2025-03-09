public class _4_2_OccurenceOfChar {
    // Brute-force method to count character in given string
    public static void countChar(String str){
        // 2 loops traversing len of str and i
        for ( int i = 0 ; i < str.length() ; i++){
            boolean flag = false;
            int count = 0;
            for (int j = 0 ; j < str.length() ; j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            //checking for 2 or more character with same name.
            for ( int k = 0 ; k < i ; k++){
                if(str.charAt(k) == str.charAt(i)){
                    flag = true;
                    break;
                }
            }
            if (flag == false){
                System.out.println("Occurence of " + str.charAt(i) + " is " + count);
            }
        }
    }

    public static void main(String[] args){
        String s = new String("hello world");
        countChar(s);
    }

}
