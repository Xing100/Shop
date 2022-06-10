package com.itx.service;

import com.itx.pojo.SpPermission;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 *
 */
public interface SpPermissionService extends IService<SpPermission> {

    List<SpPermission> getMenusList();
}
