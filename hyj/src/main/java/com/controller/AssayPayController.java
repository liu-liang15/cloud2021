package com.controller;

import com.util.IdWorker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hyj/")
public class AssayPayController {
    @RequestMapping("wkId")
    public String wkId(){
        IdWorker wk = new IdWorker(1,1,1);
        long n = wk.nextId();
        String s1 = ""+n;
        return s1;
    }
}
