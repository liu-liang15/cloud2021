package com.example.util;

import com.example.model.services.inpatient.BedServer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.TimerTask;

public class Task extends TimerTask {
    @Autowired
    BedServer bedServer=new BedServer();
    @Override
    public void run() {
        bedServer.losebedMoney();
    }
}
