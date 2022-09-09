package com.BrinMeyAir.Entity;

import javax.persistence.*;

@Entity
@Table(name = "table_order")
public class Order {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String len;
    @Column
    private String width;
    @Column
    private String height;
    @Column
    private String weight;
    @Column
    private boolean hazard;
    @Column
    private boolean perish;
    @Column
    private String orig;
    @Column
    private String dest;
    @Column
    private int shipping_type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLength() {
        return len;
    }

    public void setLength(String length) {
        this.len = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public boolean isHazard() {
        return hazard;
    }

    public void setHazard(boolean hazard) {
        this.hazard = hazard;
    }

    public boolean isPerish() {
        return perish;
    }

    public void setPerish(boolean perish) {
        this.perish = perish;
    }

    public String getOrig() {
        return orig;
    }

    public void setOrig(String orig) {
        this.orig = orig;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public int getShipping_type() {
        return shipping_type;
    }

    public void setShipping_type(int shipping_type) {
        this.shipping_type = shipping_type;
    }

    public Order() {
    }

    public Order(int id, String len, String width, String height, String weight, boolean hazard, boolean perish, String orig, String dest, int shipping_type) {
        this.id = id;
        this.len = len;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.hazard = hazard;
        this.perish = perish;
        this.orig = orig;
        this.dest = dest;
        this.shipping_type = shipping_type;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", len='" + len + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", hazard=" + hazard +
                ", perish=" + perish +
                ", orig='" + orig + '\'' +
                ", dest='" + dest + '\'' +
                ", shipping_type=" + shipping_type +
                '}';
    }
}
