package me.yummykang.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author demon
 * @since 2017-07-06
 */
@TableName("events")
public class Events extends Model<Events> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String event;
	@TableField("event_type")
	private Integer eventType;
	@TableField("event_time")
	private Date eventTime;


	public Integer getId() {
		return id;
	}

	public Events setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getEvent() {
		return event;
	}

	public Events setEvent(String event) {
		this.event = event;
		return this;
	}

	public Integer getEventType() {
		return eventType;
	}

	public Events setEventType(Integer eventType) {
		this.eventType = eventType;
		return this;
	}

	public Date getEventTime() {
		return eventTime;
	}

	public Events setEventTime(Date eventTime) {
		this.eventTime = eventTime;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Events{" +
			"id=" + id +
			", event=" + event +
			", eventType=" + eventType +
			", eventTime=" + eventTime +
			"}";
	}
}
