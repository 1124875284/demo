package com.example.cloud.mapper;

import com.example.cloud.domain.MyUser;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;


@Repository
public interface MyUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MyUser record);

    MyUser selectByPrimaryKey(Long id);


    List<MyUser> selectAll();

    int updateByPrimaryKey(MyUser record);

    @MapKey("user_name")
    Map<Integer,MyUser> selecUserMap(@Param("userName") String userName);

}