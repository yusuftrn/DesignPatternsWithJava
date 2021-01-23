package structural.decorator.decoratorExample3.decorators;

import structural.decorator.decoratorExample3.mail.Mail;

public class EncryptedDecorator extends MailDecorator {

    public EncryptedDecorator(Mail mail) {
        super(mail);
    }

    @Override
    public void sendMail() {
        super.sendMail();
        System.out.println("Mail encrypted.");
    }
}
