package structural.proxy.ProxyExample1;

import structural.proxy.ProxyExample1.downloader.YoutubeDownloader;
import structural.proxy.ProxyExample1.medialib.ThirdPartyYoutubeClass;
import structural.proxy.ProxyExample1.proxy.YoutubeCacheProxy;

public class Run {
    public static void main(String[] args){
        YoutubeDownloader naiveDownloader = new YoutubeDownloader(new ThirdPartyYoutubeClass());
        YoutubeDownloader smartDownloader = new YoutubeDownloader(new YoutubeCacheProxy());

        long naive = testDownload(naiveDownloader);
        long smart = testDownload(smartDownloader);
        System.out.println("Time saved by  caching proxy: " + (naive-smart) + "ms");
    }

    private static long testDownload(YoutubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
