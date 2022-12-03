package Question.BaekjoonAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//Fly me to the Alpha Centauri
public class Num1011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int loop = 1;
//        while (loop > 0) {
//            String[] str = br.readLine().split(" ");
//            //맨밑에 주석으로 처리한것을 보면 수가 중복되게 증가함을 알수있음
//            if (str.length == 1) {
//                loop = Integer.parseInt(str[0]);
//            } else {
//                int answer = 0;
//                for (int i = 1; i < str.length; i++) {
//                    int num = Integer.parseInt(str[i]) - Integer.parseInt(str[i - 1]);
//                    if (0 < num && num < 4) {
//                        if (num == 1) answer = 1;
//                        else if (num == 2) answer = 2;
//                        else
//                            //num이 3~4일때는 무조건 3
//                            answer = 3;
//                    } else if ((num - 4) % 3 == 0) {
//                        //num에서 위에 4개의 상황을 빼서 num-4하고 그 수를 3으로 나눴을때 나머지가 0이면 이 식 진행
//                        //예를들어 7일때 -4하면 3으로 나머지가 0 밑에 식을 진행하면 3/3=1에 1+3하니까 4
//                        //그러나 5,6일경우는 3보다 작아져 나눴을때 1이 안나오기 때문에 4의 값이 안나옴
//                        //그래서 마지막 else식으로 +3이 아닌 +4로 하여 진행
//                        answer = (num - 4) / 3 + 3;
//                    } else
//                        answer = (num - 4) / 3 + 4;
//                    System.out.println(answer);
//                    loop--;
//                }
//            }
//        }
//풀이 https://www.youtube.com/watch?v=uJJuYxtvPo4
        while (loop > 0) {
            String[] str = br.readLine().split(" ");

            if (str.length == 1) {
                loop = Integer.parseInt(str[0]);
            } else {
                int num = Integer.parseInt(str[1]) - Integer.parseInt(str[0]);
                int answer = 0;
                while (true) {
                    answer++;
                    if (num - answer * answer <= 0) break;
                }
                if (num - answer * answer == 0) {
                    answer = answer * 2 - 1;
                } else {
                    answer = answer - 1;
                    if (num - answer * answer <= answer) {
                        answer = answer * 2;
                    } else {
                        answer = answer * 2 + 1;
                    }
                }

                System.out.println(answer);
                loop--;
            }
        }

//        if (num == 1 || num == 2 || num == 3 || num == 4) {//3
//            answer = 3;
//        } else if (num == 5 || num == 6 || num == 7) {//4 1211,1221,1231
//            answer = (num - 4) / 3 + 3; num == 7
//            answer = (num - 4) / 3 + 4; num == 5,6
//        } else if (num == 8 || num == 9 || num == 10) {//5 12311,12321,12331
//
//        } else if (num == 11) {//6 123311
//
//        }


    }
}
