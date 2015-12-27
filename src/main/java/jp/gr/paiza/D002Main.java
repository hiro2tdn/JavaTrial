package jp.gr.paiza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// D002:数の比較
public class D002Main {

    public static void main(String[] args) throws Exception {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] readLineArray = line.split(" ");
        int num1 = Integer.parseInt(readLineArray[0]);
        int num2 = Integer.parseInt(readLineArray[1]);

        if (num1 != num2) {
            System.out.println(Integer.max(num1, num2));
        } else {
            System.out.println("eq");
        }
    }

}
