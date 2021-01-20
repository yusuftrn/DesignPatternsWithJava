package structural.adapter.adapterExample2;

public class Run {

    public static void main(String[] args){

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "cile_bulbulum.mp3");
        audioPlayer.play("mp4", "alone_movie.mp4");
        audioPlayer.play("vlc", "harry_potter4.mkv");
        audioPlayer.play("avi", "AVSEQ01.swh*");
    }

}
