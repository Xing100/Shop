package com.itx.mapper;

import com.itx.pojo.SpPermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @Entity com.itx.pojo.SpPermission
 */
public interface SpPermissionMapper extends BaseMapper<SpPermission> {


    List<SpPermission> getMenusList();
}




