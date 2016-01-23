package jp.gr.cipher;

import org.apache.commons.io.Charsets;

public class CipherMain {

	public static void main(String[] args) throws Exception {
		String target = "テスト";

		// 処理対象
		byte[] original = target.getBytes(Charsets.UTF_8);
		System.out.print("original ：");
		for (byte b : original) {
			System.out.printf("%02X ", b);
		}
		System.out.println();

		// 暗号化処理
		byte[] encrypted = CipherUtils.encrypt(original);
		System.out.print("encrypted：");
		for (byte b : encrypted) {
			System.out.printf("%02X ", b);
		}
		System.out.println();

		// 復号処理
		byte[] decrypted = CipherUtils.decrypt(encrypted);
		System.out.print("decrypted：");
		for (byte b : decrypted) {
			System.out.printf("%02X ", b);
		}
	}
}