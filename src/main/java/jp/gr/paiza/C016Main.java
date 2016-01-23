package jp.gr.paiza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// C016:Leet文字列
public class C016Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        line = line.replace("A", "4");
        line = line.replace("E", "3");
        line = line.replace("G", "6");
        line = line.replace("I", "1");
        line = line.replace("O", "0");
        line = line.replace("S", "5");
        line = line.replace("Z", "2");

        System.out.println(line);
    }
}
