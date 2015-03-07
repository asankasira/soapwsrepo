/**
 * 
 */
package com.home.asanka.business;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.home.asanka.model.Product;

/**
 * @author Asanka Siriwardena
 *
 */
public class ProductCatalogImpl {

	Set<String> bookList = new HashSet<>();
	Set<String> musicList = new HashSet<>();
	Set<String> movieList = new HashSet<>();
	
	
	public ProductCatalogImpl(){
		
		bookList.add("Inferno");
		bookList.add("Joyland");
		bookList.add("The Game of Thrones");
		bookList.add("PK");
		
		musicList.add("Random Access Memories");
		musicList.add("Night Visions");
		musicList.add("Unorthodox Jukebox");
		
		movieList.add("Oz the Great and Powerful");
		movieList.add("Despicable Me");
		movieList.add("Star Trek into Darkness");		
	}
	
	public List<String> getProductCategories(){
		
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		categories.add("Games");
		
		return categories;
	}
	
	public Set<String> getProducts(String category){
		
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		
		return null;
	}
	
	public boolean addProduct(String category, String product){
		
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		default:
			return false;
		}
		
		return true;
	}


	public Set<Product> getProductsV2(String category) {
		Set<Product> prodList = new HashSet<>();
		
		prodList.add(new Product("Java Brains", "65S3", 645.67));
		prodList.add(new Product("Spring In Action", "IB345", 345.80));
		prodList.add(new Product("OS Guru", "6745", 1456.08));
		
		return prodList;
	}
}
