package com.foodrecipe.model;

import java.sql.Time;
import java.util.List;

public class Admin {
	String foodName;
	List<String> ingredient;
	Time prepTime;
	Boolean Category;
	
	public Admin(String foodName, List<String> ingredient, Time prepTime, Boolean category) {
		super();
		this.foodName = foodName;
		this.ingredient = ingredient;
		this.prepTime = prepTime;
		Category = category;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public List<String> getIngredient() {
		return ingredient;
	}
	public void setIngredient(List<String> ingredient) {
		this.ingredient = ingredient;
	}
	public Time getPrepTime() {
		return prepTime;
	}
	public void setPrepTime(Time prepTime) {
		this.prepTime = prepTime;
	}
	public Boolean getCategory() {
		return Category;
	}
	public void setCategory(Boolean category) {
		Category = category;
	}
	@Override
	public String toString() {
		return "Admin [foodName=" + foodName + ", ingredient=" + ingredient + ", prepTime=" + prepTime + ", Category="
				+ Category + "]";
	}
	
	
}
