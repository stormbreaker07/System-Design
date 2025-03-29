package designPatterns.structural.proxy.caching.service;

import designPatterns.structural.proxy.caching.cache.TCache;
import designPatterns.structural.proxy.caching.entity.UserInfo;

import java.util.Optional;

//it will work as a proxy for userService before actually executing any method in userService it goes through method of
//proxyUserService that check if there is any data in cache if yes then send that back
//otherwise do a call to userService to get UserInfo once get save it in Cache then send it back
public class ProxyUserService extends UserService{

    private final TCache cache;

    public ProxyUserService() {
        super();
        cache = TCache.getInstance();
    }

    public UserInfo getUser(Integer id) {
        Object user = cache.get(id);
        if(user == null) {
            System.out.println("user not id : " + id + " doesn't exist in cache");
            UserInfo userInfo = getUserById(id);
            cache.put(id, userInfo);
            return userInfo;
        } else {
            System.out.println("user not id : " + id + " find in cache");
            return (UserInfo) user;
        }
    }

    public void putUser(Integer id, UserInfo user) {
        cache.put(id, user);
        saveUserInfo(id, user);
    }
}
