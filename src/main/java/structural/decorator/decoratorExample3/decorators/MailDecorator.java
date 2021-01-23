package structural.decorator.decoratorExample3.decorators;

import structural.decorator.decoratorExample3.mail.Mail;

public abstract class MailDecorator implements Mail {

    private Mail mail;

    public MailDecorator(Mail mail) {
        this.mail = mail;
    }

    @Override
    public void sendMail(){
        mail.sendMail();
    }
}
