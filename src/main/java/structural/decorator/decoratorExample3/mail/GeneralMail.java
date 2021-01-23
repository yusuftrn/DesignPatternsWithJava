package structural.decorator.decoratorExample3.mail;

public class GeneralMail implements Mail {

    private String sender;
    private String recipient;

    public GeneralMail(String sender, String recipient){
        this.sender = sender;
        this.recipient = recipient;
    }

    @Override
    public void sendMail() {
        System.out.println("Mail sent from " + sender + " to " + recipient);
    }
}
