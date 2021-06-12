package u享元模式;

import java.util.HashMap;
import java.util.Map;

public class WebSiteFactory {
    private Map<String, ConcreteWebSite> map = new HashMap<>();

    public WebSite getWebSiteCategory(String key){
        if (!map.containsKey(key)){
            map.put(key, new ConcreteWebSite(key));
        }
        return map.get(key);
    }

    // 获得网站分类总数
    public int getWebSiteCount(){
        return map.size();
    }
}
