package com.janita.invoker.server.bean;

import java.io.Serializable;

/**
 * Created by Janita on 2017-03-24 13:34
 */
public class Computer implements Serializable {

    private Long computerId;

    private String brand;

    private String name;

    private Double price;

    public Long getComputerId() {
        return computerId;
    }

    public void setComputerId(Long computerId) {
        this.computerId = computerId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerId=" + computerId +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
