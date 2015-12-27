package jp.gr.paiza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// B008:地下アイドルの夢
public class B008Main {

    public static void main(String[] args) throws Exception {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] readLineArray = line.split(" ");
        int n = Integer.parseInt(readLineArray[0]);
        int m = Integer.parseInt(readLineArray[1]);
        int sum = 0;

        if (n != 0 && m != 0) {
            for (int i = 0; i < m; i++) {
                String line2 = br.readLine();
                String[] readLineArray2 = line2.split(" ");
                int sum2 = 0;

                for (int j = 0; j < n; j++) {
                    sum2 += Integer.parseInt(readLineArray2[j]);
                }

                if (sum2 > 0) {
                    sum += sum2;
                }
            }
        }

        System.out.println(sum);
    }
}
