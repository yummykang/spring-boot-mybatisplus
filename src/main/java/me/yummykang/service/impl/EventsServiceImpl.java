package me.yummykang.service.impl;

import me.yummykang.entity.Events;
import me.yummykang.mapper.EventsMapper;
import me.yummykang.service.EventsService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author demon
 * @since 2017-07-06
 */
@Service
public class EventsServiceImpl extends ServiceImpl<EventsMapper, Events> implements EventsService {
	
}
