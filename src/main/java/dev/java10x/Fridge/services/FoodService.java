package dev.java10x.Fridge.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.java10x.Fridge.models.Food;
import dev.java10x.Fridge.repository.FoodRepository;

@Service
public class FoodService {
    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository){
        this.foodRepository = foodRepository;
    }
    // LISTAR
    
    public List<Food> getAll(){return foodRepository.findAll();}

    //CRIAR

    public Food save(Food food){return foodRepository.save(food);}

    //DELETAR 
    public void delete(Long Id){foodRepository.deleteById(Id);}
}
