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

    /** 暗号化アルゴリズム/暗号化モード/パディング方式 */
    private static final String TRANSFORMATION = "AES/CBC/PKCS5Padding";

    /**
     * 暗号化処理
     * @param bytes 暗号化するバイト配列
     * @return 暗号化したバイト配列
     * @throws Exception 例外
     */
    public static byte[] encrypt(byte[] bytes) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, ALGORITHM);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bytes);
    }

    /**
     * 復号処理
     * @param bytes 復号するバイト配列
     * @return 復号したバイト配列
     * @throws Exception 例外
     */
    public static byte[] decrypt(byte[] bytes) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, ALGORITHM);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bytes);
    }
}
