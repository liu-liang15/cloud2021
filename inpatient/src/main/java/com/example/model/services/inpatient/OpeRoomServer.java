package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.OpeCzRecDao;
import com.example.model.dao.inpatient.OpeRoomDao;
import com.pojos.inpatient.OpeCzRec;
import com.pojos.inpatient.OpeRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OpeRoomServer {
    @Autowired
    OpeRoomDao opeRoomDao;
    @Autowired
    OpeCzRecDao opeCzRecDao;
    //新增手术室
    public void addRoom(OpeRoom opeRoom){
        opeRoomDao.addRoom(opeRoom);
    }
    //查看手术室
    public List<OpeRoom> selRoom(String param){
        return opeRoomDao.selRoom(param);
    }
    //修改手术室
    public void upDateRoom(OpeRoom opeRoom){
        opeRoomDao.upDateRoom(opeRoom);
    }
    // 启用/停用手术室
    public void stRoom(OpeRoom opeRoom, OpeCzRec opeCzRec){
        //修改手术室
        opeRoomDao.upDateRoom(opeRoom);
        //新增手术操作表
        opeCzRecDao.addOpeCz(opeCzRec);
    }
}
