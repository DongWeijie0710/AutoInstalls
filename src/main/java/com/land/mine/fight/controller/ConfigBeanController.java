package com.land.mine.fight.controller;

import com.land.mine.fight.domain.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @task:
 * @discrption:
 * @author: dongweijie
 * @date: 2018/6/6
 * @version: 1.0.0
 */

@RestController
@EnableConfigurationProperties({ConfigBean.class})
public class ConfigBeanController {

    @Autowired
    ConfigBean configBean;

    @RequestMapping(value = "/configBean")
    public String getConfigBean() {
        return "姓名：" + configBean.getName() + " 颜色：" + configBean.getColor() + " 主打歌：" + configBean.getSong();
    }
}
