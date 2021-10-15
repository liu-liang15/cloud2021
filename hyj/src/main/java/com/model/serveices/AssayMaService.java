package com.model.serveices;

import com.model.dao.AssayMaMapper;
import com.pojos.hyj.AssayPerson;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.List;

@Service
public class AssayMaService {
    @Resource
    AssayMaMapper assayMaMapper;

    public List<AssayPerson> findAll(){
        return assayMaMapper.findPerson();
    }
    //新增
    public void insert(AssayPerson assayPerson){
        //根据身份证计算年龄
        String idCard=assayPerson.getAssayPersonCard();
        String birthday = idCard.substring(6, 14);
        Calendar now = Calendar.getInstance();
        int nowYear = now.get(Calendar.YEAR);
        int nowMonth = (now.get(Calendar.MONTH)+1);
        int nowDay = now.get(Calendar.DAY_OF_MONTH);

        int year = Integer.valueOf(birthday.substring(0, 4));
        int month = Integer.valueOf(birthday.substring(4, 6));
        int day = Integer.valueOf(birthday.substring(6));

        if (nowMonth - month >= 0 && nowDay - day >=0) {
            assayPerson.setAssayPersonAge(nowYear - year);
            assayMaMapper.insert(assayPerson);
        }else {
            assayPerson.setAssayPersonAge(nowYear - year - 1);
            assayMaMapper.addPerson(assayPerson);
        }
    }
    public void addPersonMeal(AssayPerson assayPerson){
        //根据身份证计算年龄
        String idCard=assayPerson.getAssayPersonCard();
        String birthday = idCard.substring(6, 14);
        Calendar now = Calendar.getInstance();
        int nowYear = now.get(Calendar.YEAR);
        int nowMonth = (now.get(Calendar.MONTH)+1);
        int nowDay = now.get(Calendar.DAY_OF_MONTH);

        int year = Integer.valueOf(birthday.substring(0, 4));
        int month = Integer.valueOf(birthday.substring(4, 6));
        int day = Integer.valueOf(birthday.substring(6));

        if (nowMonth - month >= 0 && nowDay - day >=0) {
            assayPerson.setAssayPersonAge(nowYear - year);
            assayMaMapper.insert(assayPerson);
        }else {
            assayPerson.setAssayPersonAge(nowYear - year - 1);
            assayMaMapper.addPersonMeal(assayPerson);
        }
    }
    //删除
    public void delPerson(AssayPerson assayPerson){
        assayMaMapper.delPerson(assayPerson);
    }
    //模糊查询
    public List<AssayPerson> likeFindPerson(AssayPerson assayPerson){
        return assayMaMapper.likeFindPerson(assayPerson);
    }
    //时间选择器
    public List<AssayPerson> timeChoose(AssayPerson assayPerson){
        return assayMaMapper.timeChoose(assayPerson);
    }
    public List<AssayPerson> selectPersonMeal(){
        return assayMaMapper.selectPersonMeal();
    }
}
