package me.yummykang.service;

import me.yummykang.entity.mongo.UserEntity;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-07-08 15:06.
 */
public interface AuthService {
    void register(UserEntity userToAdd);

    String login(String username, String password);

    String refresh(String oldToken);
}
