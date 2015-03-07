/**
 * 
 */
package com.home.asanka;

import java.util.List;
import java.util.Set;

import javax.jws.WebService;

import com.home.asanka.business.ProductCatalogImpl;
import com.home.asanka.model.Product;

/**
 * @author Asanka Siriwardena
 *
 */
@WebService(endpointInterface="com.home.asanka.IProductCatalog", portName="TestMartCatalogPort", serviceName="TestMartCatalogService")
public class ProductCatalog implements IProductCatalog {

	ProductCatalogImpl prodctCatalog = new ProductCatalogImpl();
	
	@Override
	public List<String> getProductCategories(){	
		return prodctCatalog.getProductCategories();
	}
	
	@Override
	public Set<String> getProducts(String category){
		return prodctCatalog.getProducts(category);
	}

	@Override
	public boolean addProduct(String category, String product){
		return prodctCatalog.addProduct(category, product);
	}
		
	@Override
	public Set<Product> getProductsV2(String category){
		return prodctCatalog.getProductsV2(category);
	}
}
