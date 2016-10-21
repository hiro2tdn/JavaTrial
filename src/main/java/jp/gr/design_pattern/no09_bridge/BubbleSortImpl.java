package jp.gr.design_pattern.no09_bridge;

/**
 * <pre>
 * バブルソート
 * 隣り合う要素の大小を比較しながら整列させること。
 * 最悪計算時間はO(n2)と遅いが、アルゴリズムが単純で実装が容易。
 * </pre>
 */
public class BubbleSortImpl extends SortImpl {
    public void sort(int numArray[]) {
        for (int i = 0; i < numArray.length - 1; i++) {
            for (int j = numArray.length - 1; j > i; j--) {
                if (numArray[j - 1] > numArray[j]) {
                    int tmpNum = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = tmpNum;
                }
            }
        }
    }
}
