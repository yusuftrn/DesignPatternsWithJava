package structural.decorator.decoratorExample1.decorators;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class CompressionDecorator extends DataSourceDecorator {

    private int compressionLevel = 5;

    public CompressionDecorator(DataSource source) {
        super(source);
    }

    public int getCompressionLevel() {
        return compressionLevel;
    }

    public void setCompressionLevel(int val) {
        this.compressionLevel = val;
    }

    @Override
    public void writeData(String data) {
        super.writeData(compressionCode(data));
    }

    @Override
    public String readData() {
        return decompressionCode(super.readData());
    }

    private String compressionCode(String stringData){
        byte[] data = stringData.getBytes();
        try{
            ByteArrayOutputStream byteArrayInputStream = new ByteArrayOutputStream(512);
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayInputStream,
                    new Deflater(compressionLevel));
            deflaterOutputStream.write(data);
            deflaterOutputStream.close();
            byteArrayInputStream.close();
            return Base64.getEncoder().encodeToString(byteArrayInputStream.toByteArray());

        } catch (Exception e) {
            return null;
        }
    }

    private String decompressionCode(String stringData) {
        byte[] data = Base64.getDecoder().decode(stringData);
        try{
            InputStream inputStream = new ByteArrayInputStream(data);
            InflaterInputStream inflaterInputStream = new InflaterInputStream(inputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
            int x;
            while((x = inflaterInputStream.read()) != -1 ) {
                byteArrayOutputStream.write(x);
            }
            inputStream.close();
            inflaterInputStream.close();
            byteArrayOutputStream.close();

            return byteArrayOutputStream.toString();

        } catch (Exception e) {
            return null;
        }
    }
}
