package structural.proxy.ProxyExample1.proxy;

import structural.proxy.ProxyExample1.medialib.ThirdPartyYoutubeClass;
import structural.proxy.ProxyExample1.medialib.ThirdPartyYoutubeLib;
import structural.proxy.ProxyExample1.medialib.Video;

import java.util.HashMap;

public class YoutubeCacheProxy implements ThirdPartyYoutubeLib  {

    private ThirdPartyYoutubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    public YoutubeCacheProxy(){
        this.youtubeService = new ThirdPartyYoutubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if(cachePopular.isEmpty()){
            cachePopular = youtubeService.popularVideos();
        }
        else{
            System.out.println("Retrieved list from cache");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoID) {
        Video video = cacheAll.get(videoID);
        if(video == null){
            video = youtubeService.getVideo(videoID);
            cacheAll.put(videoID, video);
        }
        else{
            System.out.println("Retrieved video '" + videoID + "' from cache.");
        }
        return video;
    }

    public void reset(){
        cachePopular.clear();
        cacheAll.clear();
    }
}
