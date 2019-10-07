package com.niit.dao;

import org.hibernate.mapping.List;
import org.springframework.cglib.core.ClassInfo;

public interface OrderDao<OrderInfo, OrderDetailInfo> {

	  public void saveOrder(ClassInfo cartInfo);
	
	  public OrderDao<OrderInfo,OrderDetailInfo> listOrderInfo(int page,
	            int maxResult, int maxNavigationPage);
	
	   public OrderInfo getOrderInfo(String orderId);
	   
	    public List listOrderDetailInfos(String orderId);
	 
	  
	    
	  
}
