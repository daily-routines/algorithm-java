package 한교진.BOJ.Math;

// 666은 종말을 나타내는 수
// 종말의 숫자란 어떤 수에 6이 적어도 3개 이상 연속으로 들어가는 수를 말한다.
// 제일 작은 종말의 숫자는 666 이고, 그 다음으로 큰 수는 1666, 2666, 3666, ... 과 같다.
// 따라서, 숌은 첫 번째 영화의 제목은 세상의 종말 666, 두 번째 영화의 제목은 세상의 종말 1666 이렇게 지을 것이다.
// 일반화해서 생각하면, N번째 영화의 제목은 세상의 종말 (N 번째로 작은 종말의 숫자)와 같다.
// 숌이 만든 N 번째 영화의 제목에 들어간 숫자를 출력하는 프로그램을 작성!

// 숫자를 증가시키면서 666 연속 숫자를 찾으면 된다.

// 시작 시간: 23:58
// 걸린 시간: 24:46

// 문제를 이해하는 데 시간이 좀 많이 걸렸다..

import java.util.Scanner;

public class N1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N 번째 제목 찾기
        int N = sc.nextInt();
        // n번째 제목 개수 체크
        int cnt = 1;
        int num = 666;

        // 2번째 제목부터 찾는 것.
        // 조건 -> n번째 제목을 찾아서 카운팅 해주는 cnt 와 입력값으로 받은 N 번째 제목이 같으면 탈출임.
        while (cnt != N) {
            num++;

            // num을 스트링으로 바꿔주고 "666" 이 포함되는 지 확인
            if (String.valueOf(num).contains("666")) {
                // 조건 통과하면 n번째 제목을 증가시켜줌.
                cnt++;
            }
        }
        System.out.println(num);
    }
}
