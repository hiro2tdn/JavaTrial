package jp.gr.yamada;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.io.Charsets;

public class CipherSample {
    /** 鍵データ */
    private static byte[] KEY = { 0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f };
    /** 初期化ベクトル */
    private static byte[] IV = { 0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, 0x1b, 0x1c, 0x1d, 0x1e, 0x1f };
    /** 暗号化アルゴリズム */
    private static final String ALGORITHM = "AES";
    /** 暗号化モード */
    private static final String MODE = "CBC";
    /** パディング方式 */
    private static final String PADDING = "PKCS5Padding";

    public static void main(String[] args) throws Exception {
        // 暗号化対象データ
        byte[] original = "暗号化対象".getBytes(Charsets.UTF_8);
        System.out.print("original ：");
        for (byte b : original) {
            System.out.printf("%02x ", b);
        }
        System.out.println();

        // 暗号化処理
        byte[] encrypted = CipherSample.encrypt(original);
        System.out.print("encrypted：");
        for (byte b : encrypted) {
            System.out.printf("%02x ", b);
        }
        System.out.println();

        // 復号処理
        byte[] decrypted = CipherSample.decrypt(encrypted);
        System.out.print("decrypted：");
        for (byte b : decrypted) {
            System.out.printf("%02x ", b);
        }
        System.out.println();
    }

    /**
     * 暗号化処理
     * @param bytes 処理対象
     * @return 処理結果
     * @throws Exception 例外
     */
    public static byte[] encrypt(byte[] bytes) throws Exception {
        Cipher cipher = Cipher.getInstance(String.join("/", ALGORITHM, MODE, PADDING));
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(KEY, ALGORITHM), new IvParameterSpec(IV));
        return cipher.doFinal(bytes);
    }

    /**
     * 復号処理
     * @param bytes 処理対象
     * @return 処理結果
     * @throws Exception 例外
     */
    public static byte[] decrypt(byte[] bytes) throws Exception {
        Cipher cipher = Cipher.getInstance(String.join("/", ALGORITHM, MODE, PADDING));
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(KEY, ALGORITHM), new IvParameterSpec(IV));
        return cipher.doFinal(bytes);
    }
}