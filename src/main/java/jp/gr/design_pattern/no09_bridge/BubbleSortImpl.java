package jp.gr.design_pattern.no09_bridge;

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
