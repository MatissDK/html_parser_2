import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public class Converter {

    private String curString;

    public Converter(String curString){
        this.curString = curString;
    }


    public String changeCharsetEncoding() {
        Charset iso88591 = Charset.forName("ISO-8859-1");
        Charset utf8 = Charset.forName("UTF-8");

        CharBuffer curBuffer = iso88591.decode(ByteBuffer.wrap(curString.getBytes()));
        ByteBuffer outputBuffer = utf8.encode(curBuffer);

        return new String(outputBuffer.array(), utf8) + " assa";
    }
}
