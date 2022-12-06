package 이상직.BOJ.N2869;

import java.util.Scanner;

public class Main {
    public static int solution(int x, int y, int z){
        int tmp = 0;
        int day = 1;
        while(tmp<z) {
            tmp = tmp + x;
            if(tmp >= z){
                break;
            }
            tmp = tmp - y;
            day++;
        }
        return day;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(solution(a, b, y));
    }
}
