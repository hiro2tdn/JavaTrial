package jp.gr.zip4j;

import java.io.File;

import org.apache.commons.io.Charsets;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

public class Zip4jMain {

    public static void main(String[] args) throws Exception {
        File inputFile = new File("target/employees.csv");

        ZipFile zipFile = new ZipFile("target/employees.zip");
        // ファイル名の文字コード
        zipFile.setFileNameCharset(Charsets.UTF_8.name());

        ZipParameters parameters = new ZipParameters();
        // 圧縮方式
        parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
        // 圧縮レベル
        parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
        parameters.setEncryptFiles(true);
        // 暗号化方式
        parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_STANDARD);
        parameters.setPassword("password");

        if (inputFile.isDirectory()) {
            zipFile.createZipFileFromFolder(inputFile, parameters, false, 0);
        } else {
            zipFile.addFile(inputFile, parameters);
        }
    }
}