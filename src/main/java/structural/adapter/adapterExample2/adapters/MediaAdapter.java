package structural.adapter.adapterExample2.adapters;

import structural.adapter.adapterExample2.players.AdvancedMediaPlayer;
import structural.adapter.adapterExample2.players.MediaPlayer;
import structural.adapter.adapterExample2.players.Mp4Player;
import structural.adapter.adapterExample2.players.VLCPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VLCPlayer();
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVLC(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
