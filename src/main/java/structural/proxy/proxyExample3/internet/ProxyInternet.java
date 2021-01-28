package structural.proxy.proxyExample3.internet;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProxyInternet implements Internet {

    private Internet internet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("facebook.com");
        bannedSites.add("tiktok.com");
        bannedSites.add("twitter.com");
        bannedSites.add("telegram.org");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if(bannedSites.contains(serverHost.toLowerCase())){
            throw new Exception("Access Denied");
        }
        internet.connectTo(serverHost);
    }
}
