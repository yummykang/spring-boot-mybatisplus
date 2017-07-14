package me.yummykang.web;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import me.yummykang.dao.mongo.UserDao;
import me.yummykang.dto.UserRequest;
import me.yummykang.entity.User;
import me.yummykang.entity.mongo.UserEntity;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author demon
 * @since 2017-07-03
 */
@RestController
@RequestMapping("/users")
@PreAuthorize("hasAuthority('USER')")
public class UserController {
    @Resource(name ="redisTemplate")
    private ValueOperations<String, String> operations;

    @Autowired
    private UserDao userDao;

    @GetMapping
    public Object users(UserRequest<User> user) {
        Wrapper<User> wrapper = new EntityWrapper<>();
        wrapper.like(!StringUtils.isEmpty(user.getName()), "name", user.getName())
                .eq(user.getSex() != -1, "sex", user.getSex());
        User query = new User();
        Page<User> result = query.selectPage(new Page<>(user.getCurrent(), user.getSize()), wrapper);
        result.setTotal(query.selectCount(wrapper));
        return result;
    }

    @PostMapping
    public Object save(@RequestBody User user) {
        user.setCreatTime(new Date());
        user.insertOrUpdate();
        return user;
    }

    @DeleteMapping
    public Object delete(int id) {
        return new User().deleteById(id);
    }

    @DeleteMapping("/batch")
    public Object deleteBatch(@RequestParam List<Integer> ids) {
        User query = new User();
        Wrapper<User> wrapper = new EntityWrapper<>();
        wrapper.in("id", ids);
        return query.delete(wrapper);
    }
}
