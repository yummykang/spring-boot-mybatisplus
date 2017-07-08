package me.yummykang.dto;

import lombok.Data;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-07-08 15:53.
 */
@Data
public class JwtAuthenticationResponse {
    private final String token;

    public JwtAuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
