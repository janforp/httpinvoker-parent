package com.janita.invoker.client.service.impl;

import com.janita.invoker.client.bean.Boss;
import com.janita.invoker.client.service.IBossService;
import com.janita.invoker.server.bean.Car;
import com.janita.invoker.server.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Janita on 2017-03-24 12:08
 */
@Service("bossService")
public class BossServiceImpl implements IBossService{

    @Autowired
    private ICarService carService;

    public Boss getBossById(Long bossId,Long carId) {
        Boss boss = new Boss();
        boss.setBoosId(bossId);
        boss.setBossName("马云");

        Car car = carService.findCarById(carId);
        boss.setBossCar(car);

        return boss;
    }
}
