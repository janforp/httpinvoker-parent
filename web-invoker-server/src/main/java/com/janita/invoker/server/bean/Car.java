package com.janita.invoker.server.bean;

import java.io.Serializable;

/**
 * Created by Janita on 2017-03-24 11:16
 */
public class Car implements Serializable {

    private java.lang.Long carId;

    private String carName;

    private Double price;

    public java.lang.Long getCarId() {
        return carId;
    }

    public void setCarId(java.lang.Long carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carName=" + carName +
                ", price=" + price +
                '}';
    }
}
