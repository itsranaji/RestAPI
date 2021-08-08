package com.rest.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.api.entity.Empdata;
@Repository
public interface EmployeeDao extends JpaRepository<Empdata, Long> {

}
