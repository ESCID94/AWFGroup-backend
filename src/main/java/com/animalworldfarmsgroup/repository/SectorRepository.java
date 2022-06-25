package com.animalworldfarmsgroup.repository;

import com.animalworldfarmsgroup.model.Farm;
import com.animalworldfarmsgroup.model.Sector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorRepository extends JpaRepository <Sector, Long>{
}
