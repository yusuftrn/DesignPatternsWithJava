package structural.adapter.adapterExample3.crypt;

public class CryptB implements Crypt{
    @Override
    public void encrypt(String text) {
        System.out.println("#CryptB#encrypt(): " + text);
    }

    @Override
    public void decrypt(String text) {
        System.out.println("#CryptB#decrypt(): " + text);
    }
}
