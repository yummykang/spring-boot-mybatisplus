package me.yummykang.dto;

import lombok.Data;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-07-08 15:30.
 */
@Data
public class JwtAuthenticationRequest {
    private String username;
    private String password;
}
