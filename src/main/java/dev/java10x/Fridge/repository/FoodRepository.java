package dev.java10x.Fridge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import dev.java10x.Fridge.models.Food;

public interface FoodRepository extends JpaRepository<Food, Long > {

     
}
