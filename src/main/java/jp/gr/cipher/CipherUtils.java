package jp.gr.cipher;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.io.Charsets;

public class CipherUtils {

    /** 鍵データ */
    private static byte[] key = "1234567890123456".getBytes(Charsets.UTF_8);
    /** 初期化ベクトル */
    private static byte[] iv = "abcdefghijklmnop".getBytes(Charsets.UTF_8);
    /** 暗号化アルゴリズム */
    private static final String ALGORITHM = "AES";
    /** 暗号化モード */
    private static final String MODE = "CBC";
    /** パディング方式 */
    private static final String PADDING = "PKCS5Padding";

    /**
     * 暗号化処理
     * @param bytes 暗号化するバイト配列
     * @return 暗号化されたバイト配列
     * @throws Exception 例外
     */
    public static byte[] encrypt(byte[] bytes) throws Exception {
        Cipher cipher = Cipher.getInstance(
                String.join("/", ALGORITHM, MODE, PADDING));
        cipher.init(Cipher.ENCRYPT_MODE,
                new SecretKeySpec(key, ALGORITHM),
                new IvParameterSpec(iv));
        return cipher.doFinal(bytes);
    }

    /**
     * 復号処理
     * @param bytes 復号するバイト配列
     * @return 復号されたバイト配列
     * @throws Exception 例外
     */
    public static byte[] decrypt(byte[] bytes) throws Exception {
        Cipher cipher = Cipher.getInstance(
                String.join("/", ALGORITHM, MODE, PADDING));
        cipher.init(Cipher.DECRYPT_MODE,
                new SecretKeySpec(key, ALGORITHM),
                new IvParameterSpec(iv));
        return cipher.doFinal(bytes);
    }
}
