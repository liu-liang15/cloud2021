package com.example.util;

import com.example.model.services.inpatient.BedServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
@Component
public class Task{
    @Autowired
    BedServer bedServer;
    //每天0点执行床位费结算
    @Scheduled(cron = "0 0 0 * * ?")
    public void fixedDelayJob() throws InterruptedException {
       bedServer.losebedMoney();
    }
}
