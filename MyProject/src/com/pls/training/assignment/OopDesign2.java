package com.pls.training.assignment;
interface Dimensions
{
	void dimensions(String capacity,String brand,int power,String battery_backup);
	void displayDimensions();
}
interface SystemRequirement
{
	void systemRequirement(String os,String memory,String LicenseKey);
	void displaySystemRequirement();
}
class Products 
{
	int product_id;
	String product_name;
	String serial_number;
	
	public void setProductsDetails(int product_id,String product_name,String serial_number)
	{
		this.product_id = product_id;
		this.product_name = product_name;
		this.serial_number = serial_number; 
	}
	void displayProductDetails()
	{
		System.out.println("Product ID : " + product_id);
		System.out.println("Product Name : " + product_name);
		System.out.println("Product Serial No : " + serial_number);
	}
}
class software extends Products implements SystemRequirement
{
	String os;
	String memory;
	String LicenseKey;
	@Override
	public void systemRequirement(String os, String memory, String LicenseKey) {
		// TODO Auto-generated method stub
		this.os=os;
		this.memory=memory;
		this.LicenseKey=LicenseKey;
	}

	@Override
	public void displaySystemRequirement() {
		// TODO Auto-generated method stub
		System.out.println("OS : " + os);
		System.out.println("Memory : " + memory);
		System.out.println("LicenseKey : " + LicenseKey);
	}
	
}
class Hardware extends Products implements Dimensions
{
	String capacity;
	String brand;
	int power;
	String battery_backup;
	
	@Override
	public void dimensions(String capacity, String brand, int power,
			String battery_backup) {
		// TODO Auto-generated method stub
		
		this.capacity=capacity;
		this.brand=brand;
		this.power=power;
		this.battery_backup=battery_backup;
	}

	@Override
	public void displayDimensions() {
		// TODO Auto-generated method stub
		System.out.println("Capacity : " + capacity);
		System.out.println("Brand : " + brand);
		System.out.println("Power : " + power);
		System.out.println("Battery Backup : " + battery_backup);
	}
	
}
public class OopDesign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hardware[] productH =new Hardware[2];
		for(int i=0;i<productH.length;i++)
		{
			productH[i]=new Hardware();
			productH[i].setProductsDetails(1, "Laptop", "L123");
			productH[i].dimensions("6GB", "Hp", 1200, "12Hz");
			productH[i].displayProductDetails();
			productH[i].displayDimensions();
			System.out.println("\n");
		}
		/*Products[] products =new software[2];
		for(int i=0;i<productH.length;i++)
		{
			productH[i]=new Hardware();
		}*/
	}
}
