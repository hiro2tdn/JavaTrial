package jp.gr.cipher;

import org.apache.commons.io.Charsets;

public class CipherMain {

	public static void main(String[] args) throws Exception {
		String target = "テスト";

		// 処理前
		byte[] plainBytes = target.getBytes(Charsets.UTF_8);
		System.out.print("処理前：");
		for (byte b : plainBytes) {
			System.out.format("%02X ", b);
		}
		System.out.println();

		// 暗号化処理
		byte[] encryptedBytes = CipherUtils.encrypt(plainBytes);
		System.out.print("暗号化：");
		for (byte b : encryptedBytes) {
			System.out.format("%02X ", b);
		}
		System.out.println();

		// 復号処理
		byte[] decryptedBytes = CipherUtils.decrypt(encryptedBytes);
		System.out.print("復号　：");
		for (byte b : decryptedBytes) {
			System.out.format("%02X ", b);
		}
	}
}