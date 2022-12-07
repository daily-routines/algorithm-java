package Question.BaekjoonAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int V = Integer.parseInt(str[2]);
        int d;

        d = ((V - A) / (A - B)) + 1;
        if ((V - A) % (A - B)!=0) d += 1;
        System.out.println(d);
    }
}
