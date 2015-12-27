package jp.gr.paiza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// B012:チェックディジット
public class B012Main {

    public static void main(String[] args) throws Exception {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] readLineArray = line.split(" ");
        int n = Integer.parseInt(readLineArray[0]);

        for (int j = 0; j < n; j++) {
            String line2 = br.readLine();
            int sum = 0;

            for (int i = 0; i < 15; i++) {
                int n2 = Integer.parseInt(line2.substring(i, i + 1));

                if (i % 2 == 0) {
                    int n3 = (n2 * 2);
                    if (n3 >= 10) {
                        sum += ((n3 % 10) + 1);
                    } else {
                        sum += n3;
                    }
                } else {
                    sum += n2;
                }
            }

            int n4 = (sum % 10);
            if (n4 == 0) {
                System.out.println(n4);
            } else {
                System.out.println(10 - n4);
            }
        }

    }
}
