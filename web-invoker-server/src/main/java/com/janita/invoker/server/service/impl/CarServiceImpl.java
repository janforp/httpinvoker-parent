package com.janita.invoker.server.service.impl;

import com.janita.invoker.server.bean.Car;
import com.janita.invoker.server.service.ICarService;

/**
 * Created by Janita on 2017-03-24 11:17
 */
public class CarServiceImpl implements ICarService {

    public Car findCarById(java.lang.Long longId) {

        Car aCar = new Car();
        aCar.setCarId(longId);
        if (longId == 1){
            aCar.setCarName("宝马");
            aCar.setPrice(9999999D);
        }else if (longId == 2){
            aCar.setCarName("奔驰");
            aCar.setPrice(8888888D);
        }else if (longId == 3){
            aCar.setCarName("红旗");
            aCar.setPrice(999999999999999D);
        }
        return aCar;
    }
}
