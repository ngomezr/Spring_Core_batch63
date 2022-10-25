package com.cogent.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.boot.entity.Plans;

@Repository
public interface PlansRepo extends JpaRepository<Plans, Integer> { // pass entity class and primary key (id)

}
