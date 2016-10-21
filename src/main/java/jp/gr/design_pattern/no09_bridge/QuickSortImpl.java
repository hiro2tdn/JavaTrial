package jp.gr.design_pattern.no09_bridge;

/**
 * <pre>
 * クイックソート
 * n個のデータをソートする際の最良計算量および平均計算量はO(nlogn)である。
 * 他のソート法と比べて、一般的に最も高速だといわれているが対象のデータの並びやデータの数によっては必ずしも速いわけではなく、
 * 最悪計算時間はO(n2)である。
 * </pre>
 */
public class QuickSortImpl extends SortImpl {
    public void sort(int[] values) {
        // check for empty or null array
        if (values == null || values.length == 0) {
            return;
        }
        quicksort(values, 0, values.length - 1);
    }

    private void quicksort(int[] values, int left, int right) {
        if (right <= left) {
            return;
        }

        int l = left;
        int r = right;
        // 1.ピボットとして配列の中央の値を選択する
        int pivot = values[l + (r - l) / 2];

        while (true) {
            // 2.左から順に値を調べ、ピボット以上のものを見つけたらその位置をlとする
            while (values[l] < pivot) {
                l++;
            }

            // 3.右から順に値を調べ、ピボット以下のものを見つけたらその位置をrとする。
            while (pivot < values[r]) {
                r--;
            }

            // 4.lがrより左にあれば、その2つの位置を入れ替え、2に戻る。
            // ただし、次の2での探索はlの一つ右、次の3での探索はrの一つ左から行う。
            if (r <= l) {
                break;
            }

            int tmp = values[l];
            values[l] = values[r];
            values[r] = tmp;
            l++;
            r--;
        }

        // 5.配列を左右2つの領域に分け、それぞれに対して再帰的に1からの手順を行う。
        quicksort(values, left, l - 1);
        quicksort(values, r + 1, right);
    }
}
