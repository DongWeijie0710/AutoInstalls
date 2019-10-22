package com.land.mine.fight.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @task:
 * @discrption:
 * @author: dongweijie
 * @date: 2018/7/13
 * @version: 1.0.0
 */

@RestController
@RequestMapping("v1.0/cs/manage")
@Slf4j
public class HuaWeiController {

    @RequestMapping("/searchByUserAndDuration")
    Boolean searchByUserAndDuration() {
        return true;
    }


}
