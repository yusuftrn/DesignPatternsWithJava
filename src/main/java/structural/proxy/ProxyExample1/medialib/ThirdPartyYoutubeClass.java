package structural.proxy.ProxyExample1.medialib;

import java.util.HashMap;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {

    private final String serverAddress = "http://www.youtube.com";

    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer(serverAddress);
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoID) {
        connectToServer(serverAddress + "/" + videoID);
        return getSomeVideo(videoID);
    }

    // -----------------------------------------------------------------------
    // Fake methods to simulate network activity. They as slow as a real life.
    // -----------------------------------------------------------------------

    private int random(int min, int max){
        return min + (int)(Math.random()*((max-min)+1));
    }

    private void experienceNetworkLatency(){
        int randomLatency = random(5, 10);
        for(int i=0; i<randomLatency; i++){
            try{
                Thread.sleep(random(50,100));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void connectToServer(String server){
        System.out.print("Connecting to " + server + "...");
        experienceNetworkLatency();
        System.out.print("Connected!" + "\n");
    }

    private HashMap<String, Video> getRandomVideos(){
        System.out.println("Downloading popular videos...");

        HashMap<String, Video> randomVideoHash = new HashMap<String, Video>();
        randomVideoHash.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        randomVideoHash.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        randomVideoHash.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
        randomVideoHash.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        randomVideoHash.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));

        System.out.print("Done" + "\n");
        return randomVideoHash;
    }
    private Video getSomeVideo(String videoID){
        System.out.print("Downloading video...");
        experienceNetworkLatency();
        Video video = new Video(videoID, "Some video title");
        System.out.print("Done!" + "\n");
        return video;
    }
}
