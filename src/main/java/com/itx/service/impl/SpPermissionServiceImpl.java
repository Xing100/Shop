package com.itx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itx.pojo.SpPermission;
import com.itx.service.SpPermissionService;
import com.itx.mapper.SpPermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class SpPermissionServiceImpl extends ServiceImpl<SpPermissionMapper, SpPermission>
    implements SpPermissionService{


    @Autowired
    private SpPermissionMapper spPermissionMapper;
    @Override
    public List<SpPermission> getMenusList() {
        List<SpPermission> menusList = spPermissionMapper.getMenusList();
        return menusList;
    }
}




