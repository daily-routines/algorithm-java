package Question.BaekjoonAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//약수
public class Num1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int idx = 0;
        while (idx<2) {
            String[] str = br.readLine().split(" ");
            int[] nums = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                nums[i] = Integer.parseInt(str[i]);
            }
            if (idx == 0) {
            } else {
                //위에 코드는 에제를받기위한 코드라서 사실상 밑에 세줄이 다입니다
                //그냥 최대수 곱 최소수 = N
                Arrays.sort(nums);
                int N = nums[0] * nums[nums.length - 1];
                System.out.println(N);
            }
            idx += 1;
        }
    }
}
