package 이상직.BOJ.N1436;

import java.util.Scanner;

public class Main {
    static boolean checkCondition(int tmp){
        char[] char_arr = Integer.toString(tmp).toCharArray();
        for (int i = 0; i < char_arr.length; i++) {
            if (i+1 < char_arr.length && i+2 < char_arr.length){
                if(char_arr[i] == '6' && char_arr[i+1] == '6' && char_arr[i+2] == '6'){
                    return true;
                }
            }
        }
        return false;
    }
    static int solution(int x){
        int result = 0;
        int tmp = 0;
        while(tmp < x){
            result = result + 1;
            if (checkCondition(result)){
                tmp++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();

        System.out.println(solution(x));
    }
}
