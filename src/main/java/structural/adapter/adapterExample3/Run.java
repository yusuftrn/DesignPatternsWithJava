package structural.adapter.adapterExample3;

import structural.adapter.adapterExample3.codex.CodeX;
import structural.adapter.adapterExample3.codex.CodeXAdapter;
import structural.adapter.adapterExample3.crypt.Crypt;
import structural.adapter.adapterExample3.crypt.CryptA;
import structural.adapter.adapterExample3.crypt.CryptB;

public class Run {

    public static void main(String[] args){

        Crypt crypt = new CryptA();
        crypt.encrypt("This text encrypted.");
        crypt.decrypt("Decrypt this text bro.");
        System.out.println("---");

        crypt = new CryptB();
        crypt.encrypt("Crypto 2");
        crypt.decrypt("Decrypts 2");
        System.out.println("---");

        CodeX codex = new CodeX();
        crypt = new CodeXAdapter(codex);
        crypt.encrypt("Rex");
        crypt.decrypt("Mex");
    }
}

/*OUTPUT:
#CryptA#encrypt(): This text encrypted.
#CryptA#decrypt(): Decrypt this text bro.
---
#CryptB#encrypt(): Crypto 2
#CryptB#decrypt(): Decrypts 2
---
#CodeX#textToCode(): Rex
#CodeX#codeToText(): Mex
 */