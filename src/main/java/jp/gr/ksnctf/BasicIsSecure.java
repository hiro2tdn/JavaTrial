package jp.gr.ksnctf;

import java.util.Base64;

import org.apache.commons.io.Charsets;

public class BasicIsSecure {
    public static void main(String[] args) throws Exception {
        String text = "cTg6RkxBR181dXg3eksyTktTSDhmU0dB";
        System.out.println(new String(Base64.getDecoder().decode(text), Charsets.UTF_8));
    }
}
