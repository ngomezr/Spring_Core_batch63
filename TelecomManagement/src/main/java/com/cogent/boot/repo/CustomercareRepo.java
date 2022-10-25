package com.cogent.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.boot.entity.Customercare;

@Repository 
public interface CustomercareRepo extends JpaRepository<Customercare, Integer> { // pass entity class and primary key (id)

}
