package com.itx.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itx.pojo.RespPageBean;
import com.itx.pojo.SpManager;
import com.itx.service.SpManagerService;
import com.itx.mapper.SpManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class SpManagerServiceImpl extends ServiceImpl<SpManagerMapper, SpManager>
    implements SpManagerService{

    @Autowired
    private SpManagerMapper spManagerMapper;

    @Override
    public RespPageBean getUserPage(int pagenum, int pagesize,String query) {
        Page pageinfo = new Page(pagenum,pagesize);
//        IPage<SpManager> SpmPage = spManagerMapper.getUserPage(pageinfo);
        System.out.println(query);
        IPage<SpManager> SpmPage = spManagerMapper.getUserPage(pageinfo,query);

        RespPageBean respPageBean = new RespPageBean(SpmPage.getTotal(),SpmPage.getRecords());
        System.out.println(respPageBean);
        return respPageBean;
    }

    @Override
    public int updataStateByid(int mgid, Boolean mgState) {
        int i = spManagerMapper.updataStateByid(mgid, mgState);
        return i;
    }
}




