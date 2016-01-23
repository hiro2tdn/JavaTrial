package jp.gr.paiza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// D002:数の比較
public class D002Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] lineArray = line.split(" ");
        int num1 = Integer.parseInt(lineArray[0]);
        int num2 = Integer.parseInt(lineArray[1]);

        if (num1 != num2) {
            System.out.println(Integer.max(num1, num2));
        } else {
            System.out.println("eq");
        }
    }

}
