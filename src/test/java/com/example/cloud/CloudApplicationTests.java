package com.example.cloud;

import com.example.cloud.domain.MyUser;
import com.example.cloud.mapper.MyUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CloudApplicationTests {

    @Autowired
    MyUserMapper myUserMapper;
    @Test
    public void contextLoads() {
        MyUser user = myUserMapper.selectByPrimaryKey(7L);
        System.out.println(user);
        
        System.out.println("nihao");

        System.out.println("user = " + user);
    }

}
