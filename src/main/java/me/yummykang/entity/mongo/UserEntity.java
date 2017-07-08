package me.yummykang.entity.mongo;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-07-08 13:29.
 */
@Data
public class UserEntity implements Serializable {
    private static final long serialVersionUID = -3258839839160856613L;

    private String id;

    private String userName;

    private String password;

    private List<String> roles = new ArrayList<>();
}
