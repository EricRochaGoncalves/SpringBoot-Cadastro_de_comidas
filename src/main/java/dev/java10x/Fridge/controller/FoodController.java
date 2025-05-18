package dev.java10x.Fridge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.java10x.Fridge.models.Food;
import dev.java10x.Fridge.services.FoodService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private final FoodService foodService;

    public FoodController(FoodService foodService){
        this.foodService = foodService;
    }
    @GetMapping
    public List<Food> getAll(){return foodService.getAll();}

    @PostMapping

    public Food create(@RequestBody Food food){return foodService.save(food);}
    
    
 



}
