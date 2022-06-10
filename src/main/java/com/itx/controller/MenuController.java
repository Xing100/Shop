package com.itx.controller;

import com.itx.pojo.R;
import com.itx.pojo.SpPermission;
import com.itx.service.SpPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuController {

    @Autowired
    private SpPermissionService spPermissionService;

    @GetMapping("/menus")
    public R getMenusList(){
        List<SpPermission> menusList = spPermissionService.getMenusList();
        if (menusList!=null){
            return R.success("获取菜单成功",menusList);
        }

        return R.error("获取失败");
    }
}
