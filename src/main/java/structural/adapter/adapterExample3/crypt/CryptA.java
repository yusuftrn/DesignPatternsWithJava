package structural.adapter.adapterExample3.crypt;

public class CryptA implements Crypt{
    @Override
    public void encrypt(String text) {
        System.out.println("#CryptA#encrypt(): " + text);
    }

    @Override
    public void decrypt(String text) {
        System.out.println("#CryptA#decrypt(): " + text);
    }
}
