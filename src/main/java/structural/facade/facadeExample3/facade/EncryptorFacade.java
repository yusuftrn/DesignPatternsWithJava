package structural.facade.facadeExample3.facade;

import structural.facade.facadeExample3.encryptors.MD5Encryptor;
import structural.facade.facadeExample3.encryptors.SHA256Encryptor;
import structural.facade.facadeExample3.encryptors.SHAEncryptor;

public class EncryptorFacade {
    public String encrypt(String type, String text){
        String hash = "";
        if(type.equalsIgnoreCase("MD5")){
            MD5Encryptor encryptor = new MD5Encryptor();
            hash = encryptor.encrypt(text);
        }
        else if(type.equalsIgnoreCase("SHA")){
            SHAEncryptor shaEncryptor = new SHAEncryptor();
            hash = shaEncryptor.encrypt(text);
        }
        else if(type.equalsIgnoreCase("SHA256")){
            SHA256Encryptor sha256Encryptor = new SHA256Encryptor();
            hash = sha256Encryptor.encrypt(text);
        }
        return hash;
    }
}
