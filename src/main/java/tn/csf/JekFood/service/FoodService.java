package tn.csf.JekFood.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.csf.JekFood.model.Food;
import tn.csf.JekFood.model.Restaurant;
import tn.csf.JekFood.repository.FoodRepository;


@Service 
public class FoodService {
	@Autowired  
	FoodRepository fR ;
	public List<Food> getAllFoods()   
	{  
		List<Food> foods = new ArrayList<Food>();  
		fR.findAll().forEach(a -> foods.add(a));  
		return foods;  	
	}  
	/*public List<Food> getFoodsByRestaurant(Restaurant r)   
	{  
		List<Food> foods = new ArrayList<Food>();  
		fR.findByRestaurant(r).forEach(a -> foods.add(a));  
		return foods;  	
	}  */

	//getting a specific record by using the method findById() of CrudRepository  
	public Food getFoodById(int id)   
	{  
		return fR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Food food)   
	{  
		fR.save(food);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void deleteFood(int id)   
	{  
		fR.deleteById(id);  
	} 

}
