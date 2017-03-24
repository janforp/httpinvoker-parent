package com.janita.invoker.client.bean;

import com.janita.invoker.server.bean.Car;

import java.io.Serializable;

/**
 * Created by Janita on 2017-03-24 11:31
 */
public class Boss implements Serializable{

    private java.lang.Long boosId;
    private String bossName;
    private Car bossCar;

    public java.lang.Long getBoosId() {
        return boosId;
    }

    public void setBoosId(java.lang.Long boosId) {
        this.boosId = boosId;
    }

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public Car getBossCar() {
        return bossCar;
    }

    public void setBossCar(Car bossCar) {
        this.bossCar = bossCar;
    }
}
