package behavioral.mediatorPattern.mediatorExample1.mediator;

/**
 * Note class for data binding.
 */
public class Note {
    private String name;
    private String text;

    public Note() {
        this.name = "New note";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName(){
        return name;
    }

    public String getText(){
        return text;
    }

    @Override
    public String toString(){
        return name;
    }
}
