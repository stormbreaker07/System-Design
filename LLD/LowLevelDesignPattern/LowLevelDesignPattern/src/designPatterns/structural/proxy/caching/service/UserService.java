package designPatterns.structural.proxy.caching.service;

import designPatterns.structural.proxy.caching.cache.TCache;
import designPatterns.structural.proxy.caching.entity.UserInfo;
import designPatterns.structural.proxy.caching.repository.UserDataRepo;

public class UserService {

    private final UserDataRepo userDataRepo;

    public UserService() {
        userDataRepo = UserDataRepo.getInstance();
    }

    public UserInfo getUserById(Integer id) {
        return userDataRepo.getUserById(id);
    }

    public void saveUserInfo(Integer id, UserInfo user) {
        userDataRepo.saveUser(id, user);
    }
}
