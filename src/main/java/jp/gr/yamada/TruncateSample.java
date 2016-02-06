package jp.gr.yamada;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

import org.apache.commons.io.Charsets;

public class TruncateSample {

    public static void main(String[] args) throws Exception {
        System.out.println(TruncateSample.truncate("あいうえお", 14));
        System.out.println(TruncateSample.truncate("あいうえお", 15));
        System.out.println(TruncateSample.truncate("あいうえお", 16));
    }

    /**
     * 文字列を指定したバイト数に切り詰める
     * @param target 処理対象
     * @param byteLength バイト数の指定
     * @return 処理結果
     */
    public static String truncate(String target, int byteLength) {

        Charset charset = Charsets.UTF_8;
        byte[] bytes = target.getBytes(charset);

        if (bytes.length <= byteLength) {
            return target;
        }

        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes, 0, byteLength);
        CharBuffer charBuffer = CharBuffer.allocate(byteLength);

        CharsetDecoder decoder = charset.newDecoder();
        decoder.onMalformedInput(CodingErrorAction.IGNORE);
        decoder.decode(byteBuffer, charBuffer, true);
        decoder.flush(charBuffer);

        return new String(charBuffer.array(), 0, charBuffer.position());
    }
}
