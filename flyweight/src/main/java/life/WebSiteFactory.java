package life;

import java.util.Hashtable;

public class WebSiteFactory {
    private Hashtable flyweights = new Hashtable();

    public IWebSite getWebSiteCategory(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new WebSiteA(key));
        }
        return ((IWebSite) flyweights.get(key));
    }

    public int getWebSiteCount() {
        return flyweights.size();
    }
}
