package structural.proxy.ProxyExample1.medialib;

public class Video {
    public String ID;
    public String title;
    public String data;

    Video(String ID, String title){
        this.ID = ID;
        this.title = title;
        this.data = "Random video.";
    }
}
