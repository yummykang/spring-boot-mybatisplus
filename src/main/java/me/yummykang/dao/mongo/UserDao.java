package me.yummykang.dao.mongo;

import me.yummykang.entity.mongo.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-07-08 13:38.
 */
@Component
public class UserDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void saveUser(UserEntity userEntity) {
        mongoTemplate.save(userEntity);
    }

    public UserEntity findUserByUserName(String userName) {
        Query query = new Query(Criteria.where("userName").is(userName));
        UserEntity user = mongoTemplate.findOne(query, UserEntity.class);
        return user;
    }

    public void updateUser(UserEntity user) {
        Query query = new Query(Criteria.where("id").is(user.getId()));
        Update update = new Update().set("userName", user.getUserName()).set("passWord", user.getPassword());
        //更新查询返回结果集的第一条
        mongoTemplate.updateFirst(query, update, UserEntity.class);
        //更新查询返回结果集的所有
        // mongoTemplate.updateMulti(query,update,UserEntity.class);
    }

    public void deleteUserById(Long id) {
        Query query = new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query, UserEntity.class);
    }
}
