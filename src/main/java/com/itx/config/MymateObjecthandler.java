package com.itx.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

@Component
public class MymateObjecthandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        metaObject.setValue("mgTime",1486720211);
        metaObject.setValue("roleId",34);
    }

    @Override
    public void updateFill(MetaObject metaObject) {

    }
}
