package com.example.demo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by x002070 on 6/18/2017.
 */

@Entity
//@Table(name = "Employee")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "name")
    public String name;

}
