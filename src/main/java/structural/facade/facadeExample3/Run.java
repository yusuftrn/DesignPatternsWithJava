package structural.facade.facadeExample3;

import structural.facade.facadeExample3.facade.EncryptorFacade;

public class Run {

    public static void main(String[] args){

        String textToEncrypt = "Hello! This message will be encrypted..";

        EncryptorFacade encryptor = new EncryptorFacade();

        System.out.println("MD5 Encryption: " + encryptor.encrypt("MD5", textToEncrypt));
        System.out.println("SHA Encryption: " + encryptor.encrypt("SHA", textToEncrypt));
        System.out.println("SHA-256 Encryption: " + encryptor.encrypt("SHA256", textToEncrypt));
    }
}
