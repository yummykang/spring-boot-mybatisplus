package me.yummykang.web;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import me.yummykang.dto.EventRequest;
import me.yummykang.entity.Events;
import me.yummykang.service.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author demon
 * @since 2017-07-06
 */
@RestController
@RequestMapping("/events")
@PreAuthorize("hasAuthority('USER')")
public class EventsController {
    @Autowired
    private EventsService service;

    @GetMapping
	public Object events(EventRequest request) {
        Wrapper<Events> wrapper = new EntityWrapper<>();
        wrapper.eq("year(event_time)", request.getYear()).eq("month(event_time)", request.getMonth());
	    return service.selectList(wrapper);
    }

    @DeleteMapping
    public Object delete(int id) {
        return service.deleteById(id);
    }

    @PostMapping
    public Object save(@RequestBody Events events) {
        return service.insert(events);
    }
}
