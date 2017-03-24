package com.janita.invoker.client.controller;

import com.janita.invoker.server.bean.Computer;
import com.janita.invoker.server.service.IComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Janita on 2017-03-24 13:44
 */
@RequestMapping("/computer")
@Controller
public class ComputerController {

    @Autowired
    private IComputerService computerService;

    @RequestMapping(value = "/fetch",method = RequestMethod.GET)
    @ResponseBody
    public Computer getComputer(Long computerId){
        return computerService.getComputer(computerId);
    }
}
