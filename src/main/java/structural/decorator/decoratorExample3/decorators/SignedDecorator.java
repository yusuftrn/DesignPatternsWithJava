package structural.decorator.decoratorExample3.decorators;

import structural.decorator.decoratorExample3.mail.Mail;

public class SignedDecorator extends MailDecorator {

    private String sign;

    public SignedDecorator(Mail mail, String sign) {
        super(mail);
        this.sign = sign;
    }

    @Override
    public void sendMail() {
        super.sendMail();
        System.out.println("Mail signed by: " + sign);
    }
}