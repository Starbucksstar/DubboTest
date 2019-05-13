package com.star.api.user;


import com.star.api.model.User;
import com.star.api.model.UserKey;

public interface UserService {

    public String queryUser(UserKey userKey);

    public int insertUSer(User user);

    public int updateUser(User user);

    public int deleteUser(UserKey userKey);

}
