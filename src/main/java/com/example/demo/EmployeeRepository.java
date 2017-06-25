package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by x002070 on 6/24/2017.
 */

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // no need of overriding any methods from jpa Repository

    // add specific method if anything is needed that is not part of jpa repository

}
