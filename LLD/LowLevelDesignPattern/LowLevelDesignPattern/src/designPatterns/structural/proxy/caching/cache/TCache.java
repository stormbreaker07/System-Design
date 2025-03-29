package designPatterns.structural.proxy.caching.cache;

import java.util.concurrent.ConcurrentHashMap;

public class TCache implements CacheInterface{

    private static TCache INSTANCE;
    private static ConcurrentHashMap<Integer, Object> cacheStore;

    private TCache() {
        cacheStore = new ConcurrentHashMap<>();
    }

    public static TCache getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new TCache();
        }
        return INSTANCE;
    }

    @Override
    public Object get(Integer key) {
        return cacheStore.getOrDefault(key, null);
    }

    @Override
    public void put(Integer key, Object value) {
        cacheStore.put(key, value);
    }

    @Override
    public boolean evict(Integer key) {
        return false;
    }
}
