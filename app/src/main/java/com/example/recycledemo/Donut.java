package com.example.recycledemo;

import java.io.Serializable;

public class Donut implements Serializable {

    private String donutName, donutDes, donutPrice;
    private int donutImg;

    public Donut(String donutName, String donutDes, String donutPrice, int donutImg) {
        this.donutName = donutName;
        this.donutDes = donutDes;
        this.donutPrice = donutPrice;
        this.donutImg = donutImg;
    }

    public Donut() {
        super();
    }

    public String getDonutName() {
        return donutName;
    }

    public String getDonutDes() {
        return donutDes;
    }

    public String getDonutPrice() {
        return donutPrice;
    }

    public int getDonutImg() {
        return donutImg;
    }

    public void setDonutName(String donutName) {
        this.donutName = donutName;
    }

    public void setDonutDes(String donutDes) {
        this.donutDes = donutDes;
    }

    public void setDonutPrice(String donutPrice) {
        this.donutPrice = donutPrice;
    }

    public void setDonutImg(int donutImg) {
        this.donutImg = donutImg;
    }
}
