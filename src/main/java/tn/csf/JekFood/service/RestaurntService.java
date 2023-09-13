package tn.csf.JekFood.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.csf.JekFood.model.Restaurant;
import tn.csf.JekFood.repository.RestaurntRepository;
@Service 

public class RestaurntService {
	@Autowired  
	RestaurntRepository rR 
	
	;
	public List<Restaurant> getAllRestaurants()   
	{  
		List<Restaurant> restaurents = new ArrayList<Restaurant>();  
		rR.findAll().forEach(a -> restaurents.add(a));  
		return restaurents;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Restaurant getRestaurantById(int id)   
	{  
		return rR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Restaurant restaurent)   
	{  
		rR.save(restaurent);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void deleteRestaurant(int id)   
	{  
		rR.deleteById(id);  
	} 
}
