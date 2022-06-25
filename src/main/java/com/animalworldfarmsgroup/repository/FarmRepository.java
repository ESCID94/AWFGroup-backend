package com.animalworldfarmsgroup.repository;

import com.animalworldfarmsgroup.model.Farm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmRepository extends JpaRepository <Farm, Long>{
}
