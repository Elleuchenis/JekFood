package tn.csf.JekFood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.csf.JekFood.model.Restaurant;
import tn.csf.JekFood.service.RestaurntService;

@RestController 
@CrossOrigin(origins = "*")
public class RestaurantController {

	@Autowired  
	RestaurntService rs;  

	//creating a get mapping that retrieves all the Article detail from the databrse   
	@GetMapping("/restaurant")
	private List<Restaurant> getAllArticles()   
	{  
		return rs.getAllRestaurants();  
	}  

	//creating a get mapping that retrieves the detail of a specific article  
	@GetMapping("/restaurant/{id}")  
	private Restaurant getRestaurant(@PathVariable("id") int id)   
	{  
		return rs.getRestaurantById(id);  
	}  

	//creating a delete mapping that deletes a specified article  
	@DeleteMapping("/article/{id}")  
	private void deleteRestaurant(@PathVariable("id") int id)   
	{  
		rs.deleteRestaurant(id);  
	} 

	//create new article
	@PostMapping("/article")  
	private int saveArticle(@RequestBody Restaurant r)   
	{  
		rs.saveOrUpdate(r);  
		return r.getId();  
	} 

	//creating put mapping that updates the article detail
	@PutMapping("/restaurant")  
	private Restaurant update(@RequestBody  Restaurant r)   
	{  
		rs.saveOrUpdate(r);  
		return r;  
	}  

}
