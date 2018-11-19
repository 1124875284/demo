package com.example.cloud.service;

import com.example.cloud.domain.MyUser;
import com.example.cloud.mapper.MyUserMapper;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author 黄志强
 * @data 2018/11/15 13:41
 */
@Service
public class UserService {

    private final MyUserMapper myUserMapper;

    public UserService(MyUserMapper myUserMapper) {
        this.myUserMapper = myUserMapper;
    }


    public MyUser getUser(Long id){
        MyUser user = myUserMapper.selectByPrimaryKey(id);
        if (Objects.isNull(user)){
            return null;
        }
        return user;
    }

}
