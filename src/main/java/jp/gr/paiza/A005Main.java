package jp.gr.paiza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// A005:パイザボウルゲーム
public class A005Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] lineArray = line.split(" ");
        // int maxFrame = Integer.parseInt(lineArray[0]);
        int pin = Integer.parseInt(lineArray[1]);
        int ball = Integer.parseInt(lineArray[2]);
        int totalScore = 0;
        int lastFrame = 0;
        int currentFrame = 1;

        String readLine = br.readLine();
        readLine = readLine.replace("G", "0");
        String[] readLineArray = readLine.split(" ");

        for (int i = 0; i < ball; i++) {
            int score = Integer.parseInt(readLineArray[i]);

            if (lastFrame < currentFrame) {
                if (pin == score) {
                    totalScore += score;
                    try {
                        totalScore += Integer.parseInt(readLineArray[i + 1]);
                    } catch (Exception e) {

                    }
                    try {
                        totalScore += Integer.parseInt(readLineArray[i + 2]);
                    } catch (Exception e) {

                    }
                    lastFrame++;
                    currentFrame++;
                } else {
                    totalScore += score;
                    lastFrame++;
                }
            } else {
                if (pin == score + Integer.parseInt(readLineArray[i - 1])) {
                    totalScore += score;
                    try {
                        totalScore += Integer.parseInt(readLineArray[i + 1]);
                    } catch (Exception e) {

                    }
                    currentFrame++;
                } else {
                    totalScore += score;
                    currentFrame++;
                }
            }

        }

        System.out.println(totalScore);
    }
}
