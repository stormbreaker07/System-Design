package designPatterns.structural.proxy.caching.cache;

public interface CacheInterface {

    public Object get(Integer key);
    public void put(Integer key, Object value);
    public boolean evict(Integer key);

}
