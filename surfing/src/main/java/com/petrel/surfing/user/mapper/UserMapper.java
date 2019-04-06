package com.petrel.surfing.user.mapper;

import com.petrel.surfing.user.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User getUser(Long id);

//    void inserUser(User user);

}
