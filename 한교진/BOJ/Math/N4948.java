package 한교진.BOJ.Math;

import java.util.Scanner;

public class N4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            n = sc.nextInt();

            // 마지막 테스트 케이스 0 탈출 조건
            if (n == 0) {
                break;
            }

            int cnt = 0;

            // n의 범위 설정
            for (int i = n + 1; i <= 2 * n; i++) {

                // 소수 판별
                boolean isFlag = true;

                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isFlag = false;
                        break;
                    }
                }

                if (isFlag) {
                    cnt++;
                }
            }
            System.out.println(cnt);

        }
    }
}

