package com.janita.invoker.server.service;

import com.janita.invoker.server.bean.Computer;

/**
 * Created by Janita on 2017-03-24 13:36
 */
public interface IComputerService {

    Computer getComputer(Long computerId);
}
