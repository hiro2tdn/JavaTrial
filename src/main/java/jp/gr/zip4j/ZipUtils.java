package jp.gr.zip4j;

import java.io.File;

import org.apache.commons.io.Charsets;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

public class ZipUtils {

    public static void zip(String source, String destination, String password) throws Exception {
        ZipFile zipFile = new ZipFile(destination);
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

    public static void unzip(String source, String destination, String password) throws Exception {
        ZipFile zipFile = new ZipFile(source);
        if (zipFile.isEncrypted()) {
            zipFile.setPassword(password);
        }
        zipFile.extractAll(destination);
    }
}