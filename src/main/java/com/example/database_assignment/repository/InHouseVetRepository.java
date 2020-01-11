package com.example.database_assignment.repository;

import com.example.database_assignment.model.In_House_Vet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InHouseVetRepository extends JpaRepository<In_House_Vet,Integer> {
}
