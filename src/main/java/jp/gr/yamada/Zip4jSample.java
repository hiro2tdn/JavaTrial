package jp.gr.yamada;

import java.io.File;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

import org.apache.commons.io.Charsets;

public class Zip4jSample {

    public static void main(String[] args) throws Exception {
        Zip4jSample.doZip("./src/main/resources/employees.csv",
                "./target/employees.zip", "password");
        Zip4jSample.doUnzip("./target/employees.zip", "./target", "password");
    }

    /**
     * ZIPファイルを作成する
     * @param source 処理対象
     * @param dest ZIPファイルの格納パス
     * @param password ZIPファイルのパスワード
     * @throws Exception 例外
     */
    public static void doZip(String source, String dest, String password)
            throws Exception {
        ZipFile zipFile = new ZipFile(dest);
        zipFile.setFileNameCharset(Charsets.UTF_8.name());

        ZipParameters parameters = new ZipParameters();
        parameters.setEncryptFiles(true);
        parameters.setPassword(password);

        // 圧縮方式　Deflate
        parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
        // 圧縮レベル 5
        parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
        // 暗号化方式 ZipCrypt
        parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_STANDARD);

        File inputFile = new File(source);
        if (inputFile.isDirectory()) {
            zipFile.createZipFileFromFolder(inputFile, parameters, false, 0);
        } else {
            zipFile.addFile(inputFile, parameters);
        }
    }

    /**
     * ZIPファイルを解凍する
     * @param source 処理対象
     * @param dest 解凍ファイルの格納パス
     * @param password ZIPファイルのパスワード
     */
    public static void doUnzip(String source, String dest, String password)
            throws Exception {
        ZipFile zipFile = new ZipFile(source);
        if (zipFile.isEncrypted()) {
            zipFile.setPassword(password);
        }
        zipFile.extractAll(dest);
    }
}