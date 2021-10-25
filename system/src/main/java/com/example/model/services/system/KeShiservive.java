package com.example.model.services.system;

import com.example.model.dao.system.KeShiDao;
import com.pojos.system.KeShi;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class KeShiservive {
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Resource
    private KeShiDao keShiDao;
//查询所有科室数据
    public List<KeShi> getks(){
        return keShiDao.selectList(null);
    }
/**
 *     查询科室和负责人的数据
 */
    public List<KeShi> getall(String shou){
        return keShiDao.selectQb(shou);
    }

//  新增科室
    public int insertks(KeShi keShi) {
//        将科室里面的员工类的员工id给科室的yg_id
        if (!"null".equals(keShi.getYuanGo())){
            keShi.setYgId(keShi.getYuanGo().getYgId()+"");
        }
        return keShiDao.insert(keShi);
    }
    //  新增科室
    public int updateks(KeShi keShi) {
//        将科室里面的员工类的员工id给科室的yg_id
        if (!"null".equals(keShi.getYuanGo())){
            keShi.setYgId(keShi.getYuanGo().getYgId()+"");
        }
        return keShiDao.updateById(keShi);
    }

    /**
     * 查询报表数据
     */
    public Map baobiao(){
        HashMap hashMap= new HashMap();
        List<KeShi> keShis = keShiDao.selectList(null);
        List kslist=new ArrayList();//科室名称集合
        List zybrlist=new ArrayList();//各科室住院病人人数
        List jzbrlist=new ArrayList();//各科室，每个月就诊人数
        HashMap hashMap2;
        for (KeShi keShi : keShis) {
            hashMap2=new HashMap();
            kslist.add(keShi.getKsName());
            jzbrlist.add(keShiDao.jzrs(keShi.getKsId()+""));

            hashMap2.put("value",keShiDao.zyrs(keShi.getKsId()+""));
            hashMap2.put("name",keShi.getKsName());

            zybrlist.add(hashMap2);

        }
        hashMap.put("kslist",kslist);
        hashMap.put("zybrlist",zybrlist);
        hashMap.put("jzbrlist",jzbrlist);
        return hashMap;
    }

    public Object dddd(){
        stringRedisTemplate.opsForValue().set("q1","cccccc");
        return stringRedisTemplate.opsForValue().get("q1");
    }
}
