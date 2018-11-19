package com.example.cloud.mapper;

import com.example.cloud.domain.MyUser;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MyUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MyUser record);

    MyUser selectByPrimaryKey(Long id);


    List<MyUser> selectAll();

    int updateByPrimaryKey(MyUser record);

}