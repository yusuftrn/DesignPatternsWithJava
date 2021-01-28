package structural.proxy.ProxyExample1.downloader;

import structural.proxy.ProxyExample1.medialib.ThirdPartyYoutubeLib;
import structural.proxy.ProxyExample1.medialib.Video;

import java.util.HashMap;

public class YoutubeDownloader {
    private ThirdPartyYoutubeLib api;

    public YoutubeDownloader(ThirdPartyYoutubeLib api){
        this.api = api;
    }

    public void renderVideoPage(String videoID){
        Video video = api.getVideo(videoID);
        System.out.println("\n-------------------------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.ID);
        System.out.println("Title: " + video.title);
        System.out.println("Video: " + video.data);
        System.out.println("-------------------------------\n");
    }

    public void renderPopularVideos(){
        HashMap<String, Video> list = api.popularVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Most popular videos on YouTube");
        for(Video video : list.values()){
            System.out.println("ID: " + video.ID + " / Title: " + video.title);
        }
        System.out.println("\n-------------------------------");
    }
}
