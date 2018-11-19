package com.example.cloud.api;

import com.example.cloud.domain.MyUser;
import com.example.cloud.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 黄志强
 * @data 2018/11/15 13:43
 */
@RestController
@Api(value = "小练习")
public class UserApi {
    private final UserService userService;

    public UserApi(UserService userService) {
        this.userService = userService;
    }


    @ApiOperation(nickname = "用户", value = "查看用户", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @GetMapping("/app")
    @ResponseBody
    public MyUser getApp(@RequestParam Long id){
        MyUser user = userService.getUser(id);
        return user;
    }

}
