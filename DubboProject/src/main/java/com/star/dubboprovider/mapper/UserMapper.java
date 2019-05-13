package com.star.dubboprovider.mapper;

import com.star.api.model.User;
import com.star.api.model.UserKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    int deleteByPrimaryKey(UserKey key);

    int insert(User record);

    User selectByPrimaryKey(UserKey userKey);

    int updateByPrimaryKey(User record);
}