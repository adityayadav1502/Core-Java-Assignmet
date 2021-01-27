package com.psl.training.oop.order;

import java.util.Date;

public class PurchaseOrder {
	
	int poNumber;
	Date orderDate;
	Date shipDate;
	
	public boolean isShipped()
	{
		return true;
	}
	public double sumiteams()
	{
		return 0;
	}
	public void setShipDate(Date date)
	{
		orderDate = date;
	}
	public void create(int poNumber,Date orderDate)
	{
		
	}
	public OrderItem[] getitemas()
	{
		OrderItem OrderItem[] = new OrderItem[3];
		
		return OrderItem;
	}
}
