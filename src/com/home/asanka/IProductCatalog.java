/**
 * 
 */
package com.home.asanka;

import java.util.List;
import java.util.Set;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.home.asanka.model.Product;

/**
 * @author Asanka Siriwardena
 * <p>This is the Service End Point Interface (SEI)</p>
 */

@WebService(name="TestMartCatalog", targetNamespace = "https://www.testmart.com")
public interface IProductCatalog {

	@WebMethod(action="fetch_categories", operationName= "fetchCategoryNames")
	public abstract List<String> getProductCategories();

	@WebMethod(exclude=false)
	public abstract Set<String> getProducts(String category);

	@WebMethod(exclude=false)
	public abstract boolean addProduct(@WebParam(name="category") String category, @WebParam(name="product") String product);

	@WebMethod
	@WebResult(name="Product")
	public abstract Set<Product> getProductsV2(String category);

}