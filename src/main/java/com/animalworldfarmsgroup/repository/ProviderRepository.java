package com.animalworldfarmsgroup.repository;

import com.animalworldfarmsgroup.model.Farm;
import com.animalworldfarmsgroup.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends JpaRepository <Provider, Long>{
}
