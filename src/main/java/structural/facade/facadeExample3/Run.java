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
/*
MD5 Encryption: 132d54dc7c4704fc0410f3221172a115
SHA Encryption: 8aa41da8984e30d90bb63119e6d0b7cd8177cf1a
SHA-256 Encryption: 3b4fafbec0dc32de4b56f7570a039d73d3bc1f0b5f8434de8c44e9e0df5fbbe4
 */