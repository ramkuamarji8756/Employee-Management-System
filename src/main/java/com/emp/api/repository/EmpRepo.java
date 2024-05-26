package com.emp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.api.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
