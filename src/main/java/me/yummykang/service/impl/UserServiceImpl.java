package me.yummykang.service.impl;

import me.yummykang.entity.User;
import me.yummykang.mapper.UserMapper;
import me.yummykang.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author demon
 * @since 2017-07-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
	
}
