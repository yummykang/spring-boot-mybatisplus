package me.yummykang.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * druid属性配置
 */
@ConfigurationProperties(value = "druid")
@Data
public class DruidProperties {
    private String url;
    private String username;
    private String password;
    private String driverClass;

    private int maxActive;
    private int minIdle;
    private int initialSize;
    private boolean testOnBorrow;
    private String filters;
}
