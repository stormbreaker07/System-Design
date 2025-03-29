package designPatterns.structural.proxy.caching.repository;

import designPatterns.structural.proxy.caching.entity.UserInfo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserDataRepo {

    private static UserDataRepo INSTANCE;
    private static ConcurrentHashMap<Integer, UserInfo> users;

    private UserDataRepo() {

        users = new ConcurrentHashMap<>();
        users.put(1, new UserInfo("tanuj", "tanuj@gmail.com", "******", "239348203"));
        users.put(2, new UserInfo("Manu", "manu@gmail.com", "******", "232334203"));
        users.put(3, new UserInfo("Aman", "aman@gmail.com", "******", "6645348203"));
        users.put(4, new UserInfo("John", "john@gmail.com", "******", "776348203"));

    }

    public static UserDataRepo getInstance() {
        if(INSTANCE == null) {
           INSTANCE = new UserDataRepo();
        }
        return INSTANCE;
    }

    public UserInfo getUserById(Integer id) {
        return users.getOrDefault(id, null);
    }

    public void saveUser(Integer id, UserInfo user) {
        users.put(id, user);
    }
}
