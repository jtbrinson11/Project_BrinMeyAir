package com.BrinMeyAir.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "table_customer")
public class Customer {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
    @SequenceGenerator(name = "id_generator", initialValue = 1000000, allocationSize = 1)
    private int id;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(columnDefinition = "BLOB")
    private List<Order> orderList;
    @Column
    private String location;
    @Column
    private String username;
    @Column
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public String getLocation() {
        return location;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Customer() {
    }

    public Customer(int id, List<Order> orderList, String location, String username, String password) {
        this.id = id;
        this.orderList = orderList;
        this.location = location;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", orderList=" + orderList +
                ", location='" + location + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
