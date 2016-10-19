package jp.gr.design_pattern.no09_bridge;

public class Sorter {
    private SortImpl sortImpl;

    public Sorter(SortImpl sortImpl) {
        this.sortImpl = sortImpl;
    }

    public void sort(int obj[]) {
        sortImpl.sort(obj);
    }
}
