package jp.gr.paiza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// A011:うなぎを蒲焼きにしたくない
public class A011Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] lineArray = line.split(" ");
        int length = Integer.parseInt(lineArray[0]);
        int moveCount = Integer.parseInt(lineArray[1]);
        int position = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < moveCount; i++) {
            String readLine = br.readLine();
            int hosuu = Integer.parseInt(readLine);
            if (position + hosuu <= length) {
                sb.append("R");
                position += hosuu;
            } else {
                sb.append("L");
                position -= hosuu;
            }
        }

        System.out.println(sb.toString());
    }
}
