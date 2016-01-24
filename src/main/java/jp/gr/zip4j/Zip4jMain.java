package jp.gr.zip4j;

public class Zip4jMain {

    public static void main(String[] args) throws Exception {
        // 動作確認
        ZipUtils.zip("target/employees.csv", "target/employees.zip", "password");
        ZipUtils.unzip("target/employees.zip", "target/tmp", "password");
    }
}