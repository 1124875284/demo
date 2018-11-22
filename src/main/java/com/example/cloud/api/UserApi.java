package com.example.cloud.api;

import com.example.cloud.domain.MyUser;
import com.example.cloud.dto.UserDTO;
import com.example.cloud.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.sf.json.util.JSONUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author 黄志强
 * @data 2018/11/15 13:43
 */
@RestController
public class UserApi {
    private final UserService userService;

    public UserApi(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/app/{id}")
    @ResponseBody
    public MyUser getApp(@PathVariable Long id){
        MyUser user = userService.getUser(id);

        return user;
    }

}
