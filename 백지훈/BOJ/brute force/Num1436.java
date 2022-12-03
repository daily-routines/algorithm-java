package Question.BaekjoonAlgorithm;

import java.util.Scanner;

//영화감독 숀
public class Num1436 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();

        //문제 이해
        //종말의 숫자란 어떤 수에 6이 적어도 3개이상 연속으로 들어가는 수를 말한다.
        //제일 작은 종말의 숫자는 666이고, 그 다음으로 큰 수는 1666, 2666, 3666, .... 과 같다.
        //N번째 영화의 제목은 세상의 종말 (N번째로 작은 종말의 숫자) 와 같다.
        //위 규칙상 7번째는 6666처럼 보이나 6666보다 6660이라는 작은수가 존재함으로
        //7번째는 6660 8번쨰는 6661식으로 진행됨

        //고로 나는 0부터 루프를 돌려서 666을 포함하는 모든 수의 갯수를 세고 count==N이 될때의 마지막 N번째 666을 포함하는 수를 출력

        //숫자가 계속 증가되는 필드
        int num = 0;
        //N값까지 666이 몇개인지 세어주는 필드
        int count = 0;
        //최종값표시할 필드
        String count666 = null;

        //N번째까지 계속 돌려서 666을 포함한 수의 갯수를 세고 N번째가 됬을 때 666을 포함하고 있는 값을 출력
        while (N>count) {
            count666 = String.valueOf(num);
            if (count666.contains("666")) count++;
            num++;
        }
        System.out.println(count666);
    }
}
