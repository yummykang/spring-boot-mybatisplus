package me.yummykang.dto;

import com.baomidou.mybatisplus.plugins.Page;
import lombok.Data;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-07-05 13:18.
 */
@Data
public class UserRequest<T> extends Page<T> {
    private String name;

    private int sex = -1;
}
