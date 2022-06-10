package com.itx.service;

import com.itx.pojo.RespPageBean;
import com.itx.pojo.SpManager;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 *
 */
public interface SpManagerService extends IService<SpManager> {

//    RespPageBean getUserPage(int pagenum, int pagesize);
    RespPageBean getUserPage(int pagenum, int pagesize,String query);



    int updataStateByid(int mgid, Boolean mgState);
}
