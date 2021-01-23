package structural.decorator.decoratorExample3;

import structural.decorator.decoratorExample3.decorators.EncryptedDecorator;
import structural.decorator.decoratorExample3.decorators.SignedDecorator;
import structural.decorator.decoratorExample3.mail.GeneralMail;
import structural.decorator.decoratorExample3.mail.Mail;

public class Run {
    public static void main(String[] args) {
        String sender = "Yusuf Turan";
        String recipient = "Foo Boo";

        Mail generalMail = new GeneralMail(sender, recipient);
        Mail signedMail = new SignedDecorator(generalMail, "Yusuf Turan");
        Mail encryptedMail = new EncryptedDecorator(signedMail);

        encryptedMail.sendMail();
    }
}
/*
Mail sent from Yusuf Turan to Foo Boo
Mail signed by: Yusuf Turan
Mail encrypted.
 */
