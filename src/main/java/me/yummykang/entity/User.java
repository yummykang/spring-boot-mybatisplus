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
 * @since 2017-07-04
 */
@TableName("user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 200
     */
	private String name;
	private Integer age;
	@TableField("creat_time")
	private Date creatTime;
    /**
     * 0:女，1:男
     */
	private Integer sex;


	public Integer getId() {
		return id;
	}

	public User setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public User setName(String name) {
		this.name = name;
		return this;
	}

	public Integer getAge() {
		return age;
	}

	public User setAge(Integer age) {
		this.age = age;
		return this;
	}

	public Date getCreatTime() {
		return creatTime;
	}

	public User setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
		return this;
	}

	public Integer getSex() {
		return sex;
	}

	public User setSex(Integer sex) {
		this.sex = sex;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "User{" +
			"id=" + id +
			", name=" + name +
			", age=" + age +
			", creatTime=" + creatTime +
			", sex=" + sex +
			"}";
	}
}
