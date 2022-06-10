package com.itx;

import com.itx.pojo.SpPermission;
import com.itx.service.SpPermissionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ShopApplicationTests {

    @Autowired
    private SpPermissionService spPermissionService;

    @Test
    void contextLoads() {
    }

    @Test
    void getMenusList(){
        List<SpPermission> menusList = spPermissionService.getMenusList();
        System.out.println(menusList);
    }

}
