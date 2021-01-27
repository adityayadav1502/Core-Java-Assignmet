package com.psl.training.model;

import java.util.Arrays;

public class Customer {
private int custId;
private String customerName;
private String city;
private PurchaseOrder po[]=new PurchaseOrder[5];

public Customer() {
	// TODO Auto-generated constructor stub
}

public Customer(int custId, String customerName, String city, PurchaseOrder[] po) {
	super();
	this.custId = custId;
	this.customerName = customerName;
	this.city = city;
	this.po = po;
}

public int getCustId() {
	return custId;
}

public void setCustId(int custId) {
	this.custId = custId;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public PurchaseOrder[] getPo() {
	return po;
}

public void setPo(PurchaseOrder[] po) {
	this.po = po;
}

@Override
public String toString() {
	return "Customer [custId=" + custId + ", customerName=" + customerName
			+ ", city=" + city + ", po=" + Arrays.toString(po) + "]";
}


}
