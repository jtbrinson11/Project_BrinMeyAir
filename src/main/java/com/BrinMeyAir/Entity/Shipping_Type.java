package com.BrinMeyAir.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "table_shipping_type")
public class Shipping_Type {

    @Id
    @Column
    @JsonProperty("id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
    @SequenceGenerator(name = "id_generator", sequenceName = "id_gen", initialValue = 1, allocationSize = 1)
    private int id;
    @Column
    @JsonProperty("name")
    private String name;
    @Column
    @JsonProperty("speed")
    private String speed;
    @Column
    @JsonProperty("requirements")
    private String requirements;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public Shipping_Type() {
    }

    public Shipping_Type(int id, String name, String speed, String requirements) {
        this.id = id;
        this.name = name;
        this.speed = speed;
        this.requirements = requirements;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speed='" + speed + '\'' +
                ", requirements='" + requirements + '\'' +
                '}';
    }
}
