package com.janita.invoker.server.service.impl;

import com.janita.invoker.server.bean.Computer;
import com.janita.invoker.server.service.IComputerService;

/**
 * Created by Janita on 2017-03-24 13:36
 */
public class ComputerServiceImpl implements IComputerService {

    public Computer getComputer(Long computerId) {
        Computer computer = new Computer();
        computer.setComputerId(computerId);
        if (computerId == 1){
            computer.setBrand("联想");
            computer.setPrice(4564.8);
            computer.setName("联想笔记本");
        }else if (computerId == 2){
            computer.setBrand("海尔");
            computer.setPrice(3564.8);
            computer.setName("海尔笔记本");
        }else if (computerId == 3){
            computer.setBrand("惠普");
            computer.setPrice(9564.8);
            computer.setName("惠普笔记本");
        }
        return computer;
    }
}
