package com.itx.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itx.pojo.SpManager;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Entity com.itx.pojo.SpManager
 */
public interface SpManagerMapper extends BaseMapper<SpManager> {

//    IPage<SpManager> getUserPage(@Param("pageinfo") Page pageinfo);
    IPage<SpManager> getUserPage(@Param("pageinfo") Page pageinfo,@Param("query") String query);



    int updataStateByid(int mgid, Boolean mgState);
}




