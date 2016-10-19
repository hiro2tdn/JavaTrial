package jp.gr.design_pattern.no09_bridge;

import java.util.Random;

/**
 * <pre>
 * 構造に関するパターン
 * 「橋渡し」のクラスを用意することによって、クラスを複数の方向に拡張させることを目的とする
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        // ランダム配列をバブルソートする
        int[] data = makeRandomArrays(10);
        Sorter bubbleSorter = new Sorter(new BubbleSortImpl());
        bubbleSorter.sort(data);
        for (int d : data) {
            System.out.printf("%x ", d);
        }
        System.out.println();

        // ランダム配列をクイックソートする
        data = makeRandomArrays(10);
        Sorter quickSorter = new Sorter(new QuickSortImpl());
        quickSorter.sort(data);
        for (int d : data) {
            System.out.printf("%x ", d);
        }
        System.out.println();
    }

    private static int[] makeRandomArrays(int length) {
        int[] data = new int[length];
        for (int i = 0; i < length; i++) {
            data[i] = new Random().nextInt(10);
        }
        return data;
    }
}
