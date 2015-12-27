package jp.gr.truncate;

public class TruncateMain {
    public static void main(String[] args) throws Exception {
        System.out.println(TruncateUtils.truncate("a", 0));
        System.out.println(TruncateUtils.truncate("a", 1));
        System.out.println(TruncateUtils.truncate("a", 2));
        System.out.println(TruncateUtils.truncate("あ", 2));
        System.out.println(TruncateUtils.truncate("あ", 3));
        System.out.println(TruncateUtils.truncate("あ", 4));
    }
}
