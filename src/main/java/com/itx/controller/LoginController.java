package com.itx.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itx.pojo.Login;
import com.itx.pojo.R;
import com.itx.pojo.SpManager;
import com.itx.service.SpManagerService;
import com.itx.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    private SpManagerService spManagerService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @PostMapping("/login")
    public R login(@RequestBody Login login){
//        System.out.println(login);
        SpManager spManager = spManagerService.getOne(new QueryWrapper<SpManager>()
                .eq("mg_name", login.getUsername())
                .eq("mg_pwd", login.getPassword()));
        if (spManager!=null){

            //生成token
            String token = jwtTokenUtil.generateToken(login);
            Map<String,String> tokenMap = new HashMap<>();
            tokenMap.put("token",token);
            tokenMap.put("tokenHead",tokenHead);
            return R.success("登录成功",tokenMap);
        }
        return R.error("登录失败用户名或密码错误");
    }

}
