package structural.adapter.adapterExample2.players;

public class VLCPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing VLC file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing.
    }
}
