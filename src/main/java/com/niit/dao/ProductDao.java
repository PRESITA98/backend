package com.niit.dao;

import java.util.List;

import com.niit.model.User;

public interface ProductDao<ProductInfo> {
	 public ProductDao<ProductInfo> findProduct(String code);
	 
	 public ProductInfo findProductInfo(String code) ;
	 
	 public ProductDao<ProductInfo> queryProducts(int page,
             int maxResult, int maxNavigationPage  );
	 
	 public ProductDao<ProductInfo> queryProducts(int page, int maxResult,
             int maxNavigationPage, String likeName);
	 
	 public void save(ProductInfo productInfo);

	public List<User> getUserList();
	    
	    
}