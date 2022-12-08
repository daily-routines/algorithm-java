package Question.BaekjoonAlgorithm;


import java.util.Scanner;

//베르트랑 공준
public class Num4948 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int N;
        while (true) {
            N = console.nextInt();
            int n = N * 2;
            int answer = 0;

            if (N==1){
                answer++;
            } else if (N==0) {
                break;
            }
            //n 까지의 모든 수 배열생성
            int[] sosu = new int[n + 1];
            //0, 1 제외
            sosu[0] = 0;
            sosu[1] = 0;
            //2 이상의 큰수들은 배열에 다 1이라고저장
            for (int i = 2; i <= n; i++) sosu[i] = 1;
            //에라토스테네스의 체를 이용 소수가 아닌 애들은 0으로 처리
            for (int i = 2; (i * i) <= n; i++) {
                if (sosu[i] == 1) {
                    for (int j = i * i; j <= n; j += i) sosu[j] = 0;
                }
            }
            //N과 n사이의 숫자 1세기
            for (int i = N + 1; i < n; i++) {
                if (sosu[i] == 1) {
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }

}
