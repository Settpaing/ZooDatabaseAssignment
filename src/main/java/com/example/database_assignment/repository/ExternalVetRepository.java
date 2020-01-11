package com.example.database_assignment.repository;

import com.example.database_assignment.model.External_Vet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExternalVetRepository extends JpaRepository<External_Vet,Integer> {
}
