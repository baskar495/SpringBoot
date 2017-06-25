package com.example.demo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by x002070 on 6/18/2017.
 */

@Entity
@Table(name = "\"Employee_Try\"") //by default , table name/class name is converted to lowercase(eg:employee_try)
// If @Table is not provided, then the framework picks class name and converts into table name(with lowercase)
public class EmployeeTry implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    public int id;

    @Column(name = "name")
    public String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
