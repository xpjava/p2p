package com.p2p.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DELL on 2018/1/24.
 */
@RestController
public class IndexController {
    @RequestMapping("/111")
    public String index(){
        return "success";
    }
}
