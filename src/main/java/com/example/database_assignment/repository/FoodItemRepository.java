package com.example.database_assignment.repository;

import com.example.database_assignment.model.Food_Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemRepository extends JpaRepository<Food_Item,Integer> {
}
