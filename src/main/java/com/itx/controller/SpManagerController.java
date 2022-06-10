package com.itx.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itx.pojo.Login;
import com.itx.pojo.R;
import com.itx.pojo.RespPageBean;
import com.itx.pojo.SpManager;
import com.itx.service.SpManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class SpManagerController {

    @Autowired
    private SpManagerService spManagerService;

//    查询用户分页
    @GetMapping("/users")
    public RespPageBean getManager(String query, int pagenum, int pagesize){
//        System.out.println(query+pagenum+pagesize);
//        Page pageInfo = new Page(pagenum,pagesize);
//        spManagerService.page(pageInfo);
//        return R.success("获取成功",pageInfo);
//        System.out.println(query);
//        System.out.println(pagenum);
        return spManagerService.getUserPage(pagenum,pagesize,query);
//        return spManagerService.getUserPage(pagenum,pagesize);
    }
//    更新用户状态
    @PutMapping("users/{mgid}/state/{mgState}")
    public R updataState(@PathVariable("mgid") int mgid,@PathVariable("mgState")Boolean mgState){
//        System.out.println(mgid);
//        System.out.println(mgState);
        int i = spManagerService.updataStateByid(mgid, mgState);
//        System.out.println(i);
        if (i!=0){
            return new R("更新用户状态成功",200,null);
        }
        return new R("更新用户状态失败",500,null);
    }

//    添加用户
    @PostMapping("/users")
    public R addUser(@RequestBody Login login){
        SpManager mg_name = spManagerService.getOne(new QueryWrapper<SpManager>().eq("mg_name", login.getUsername()));
//        System.out.println("-----------------------------------------");
//        System.out.println(mg_name);
        if (mg_name!=null){
            return R.error("已存在该用户");
        }
        SpManager spManager = new SpManager();
        spManager.setMgName(login.getUsername());
        spManager.setMgPwd(login.getPassword());
        spManager.setMgEmail(login.getEmail());
        spManager.setMgMobile(login.getMobile());
        boolean save = spManagerService.save(spManager);
//        System.out.println("---------------------------------------");
//        System.out.println(save);
        if (save){
            return R.success("添加成功");
        }
        return R.error("添加失败");
    }
//    根据id查询用户

    @GetMapping("users/{id}")
    public R getUsersById(@PathVariable("id") Integer id){
//        System.out.println(id);
        SpManager spManager = spManagerService.getOne(new QueryWrapper<SpManager>().eq("mg_id", id));
        if (spManager!=null){
            return R.success("查询成功",spManager);
        }
        return R.error("查询失败");
    }
//    根据id修改用户
    @PutMapping("users/{id}")
    public R updateById(@RequestBody SpManager spManager,@PathVariable("id") int id){
        spManager.setMgId(id);
        boolean b = spManagerService.updateById(spManager);
        if (b){
            return R.success("更新成功");
        }
        return R.error("更新失败");
    }

    // 根据id删除用户

    @DeleteMapping("/users/{id}")
    public R deleteById(@PathVariable("id") Integer id){
//        System.out.println(id);
        boolean b = spManagerService.removeById(id);
        if (b){
            return R.success("删除成功");
        }
        return R.error("删除失败");
    }


}
