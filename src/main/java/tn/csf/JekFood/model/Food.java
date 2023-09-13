package tn.csf.JekFood.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private int id;
	@Column 
	private String  name;
	@Column 
	private int price;
	@Column 
	private String[] tags;
	@Column 
	private boolean favorite=false;
	@Column 
	private int stars=0;
	@Column 
	private String imageUrl;
	@Column 
	private String[] origins;
	@Column 
	private String cookTime;
	@ManyToOne(optional=false) //champ obligatoire
	@JoinColumn(name="idrestaurant", referencedColumnName="id")
	private Restaurant restaurant;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	public boolean isFavorite() {
		return favorite;
	}
	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String[] getOrigins() {
		return origins;
	}
	public void setOrigins(String[] origins) {
		this.origins = origins;
	}
	public String getCookTime() {
		return cookTime;
	}
	public void setCookTime(String cookTime) {
		this.cookTime = cookTime;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", price=" + price + ", tags=" + Arrays.toString(tags)
				+ ", favorite=" + favorite + ", stars=" + stars + ", imageUrl=" + imageUrl + ", origins="
				+ Arrays.toString(origins) + ", cookTime=" + cookTime + ", restaurant=" + restaurant + "]";
	}


}
