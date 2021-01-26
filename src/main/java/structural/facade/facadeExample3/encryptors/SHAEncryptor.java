package structural.facade.facadeExample3.encryptors;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHAEncryptor {
    public String encrypt(String text){
        String hash = "";
        try{
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            byte[] textBytes = messageDigest.digest(text.getBytes(StandardCharsets.UTF_8));

            StringBuffer buffer = new StringBuffer();
            for(int i=0; i<textBytes.length; i++){
                buffer.append(Integer.toString((textBytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            hash = buffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hash;
    }
}
