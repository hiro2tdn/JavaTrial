package jp.gr.yamada;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class JoinSample {
    public static void main(String[] args) throws Exception {
        String[] array = new String[100000];
        Arrays.fill(array, "@");
        String delimiter = ",";

        plusOperator(array, delimiter);
        stringBuilder(array, delimiter);
        stringBuffer(array, delimiter);
        stringJoiner(array, delimiter);
        stringJoin(array, delimiter);
        stringJoining(array, delimiter);
    }

    /**
     * +演算子の場合
     */
    private static void plusOperator(String[] array, String delimiter) {
        long start = System.nanoTime();
        String str = new String();
        for (String s : array) {
            str = str + s + delimiter;
        }
        long end = System.nanoTime();
        System.out.println(String.format("%-20s:%5dms", "PlusOperator", (end - start) / 1000000));
    }

    /**
     * StringBuilderの場合
     */
    private static void stringBuilder(String[] array, String delimiter) {
        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (String s : array) {
            sb.append(s);
            sb.append(delimiter);
        }
        long end = System.nanoTime();
        System.out.println(String.format("%-20s:%5dms", "StringBuilder", (end - start) / 1000000));
    }

    /**
     * StringBufferの場合
     */
    private static void stringBuffer(String[] array, String delimiter) {
        long start = System.nanoTime();
        StringBuffer sb = new StringBuffer();
        for (String s : array) {
            sb.append(s);
            sb.append(delimiter);
        }
        long end = System.nanoTime();
        System.out.println(String.format("%-20s:%5dms", "StringBuffer", (end - start) / 1000000));
    }

    /**
     * StringJoinerの場合
     */
    private static void stringJoiner(String[] array, String delimiter) {
        long start = System.nanoTime();
        StringJoiner sj = new StringJoiner(delimiter);
        for (String s : array) {
            sj.add(s);
        }
        long end = System.nanoTime();
        System.out.println(String.format("%-20s:%5dms", "StringJoiner", (end - start) / 1000000));
    }

    /**
     * String#joinの場合
     */
    private static void stringJoin(String[] array, String delimiter) {
        long start = System.nanoTime();
        String.join(delimiter, array);
        long end = System.nanoTime();
        System.out.println(String.format("%-20s:%5dms", "String#join", (end - start) / 1000000));
    }

    /**
     * Collectors#joiningの場合
     */
    private static void stringJoining(String[] array, String delimiter) {
        long start = System.nanoTime();
        Arrays.stream(array).collect(Collectors.joining(delimiter));
        long end = System.nanoTime();
        System.out.println(String.format("%-20s:%5dms", "Collectors#joining", (end - start) / 1000000));
    }
}
