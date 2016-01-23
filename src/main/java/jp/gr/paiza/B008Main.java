package jp.gr.paiza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// B008:地下アイドルの夢
public class B008Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] lineArray = line.split(" ");
        int n = Integer.parseInt(lineArray[0]);
        int m = Integer.parseInt(lineArray[1]);
        int sum = 0;

        if (n != 0 && m != 0) {
            for (int i = 0; i < m; i++) {
                String readLine = br.readLine();
                String[] readLineArray = readLine.split(" ");
                int sum2 = 0;

                for (int j = 0; j < n; j++) {
                    sum2 += Integer.parseInt(readLineArray[j]);
                }

                if (sum2 > 0) {
                    sum += sum2;
                }
            }
        }

        System.out.println(sum);
    }
}
