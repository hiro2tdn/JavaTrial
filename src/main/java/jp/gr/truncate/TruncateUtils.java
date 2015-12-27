package jp.gr.truncate;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

import org.apache.commons.io.Charsets;

public class TruncateUtils {

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
