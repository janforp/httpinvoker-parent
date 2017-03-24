package com.janita.invoker.client.controller;

import com.janita.invoker.client.bean.Boss;
import com.janita.invoker.client.service.IBossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Janita on 2017-03-24 12:07
 */
@Controller
@RequestMapping("/boss")
public class BossController {

    @Autowired
    private IBossService bossService;

    @RequestMapping(value = "/fetch",method = RequestMethod.GET)
    @ResponseBody
    public Boss getBoss(Long bossId,Long carId){
        Boss boss = bossService.getBossById(bossId,carId);

        return boss;
    }
}
