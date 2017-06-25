package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by  on 6/24/2017.
 */

public interface EmployeeTryRepository extends JpaRepository<EmployeeTry, Long> {

    // no need of overriding any methods from jpa Repository

    // add specific method if anything is needed that is not part of jpa repository

}
