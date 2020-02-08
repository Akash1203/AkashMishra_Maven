package com.maven.epam_assign;

public class Chocolates implements Gift{
	double price,weight;
	String name;
	int category;
	
	public Chocolates(double price,double weight,String name,int category)
	{
		this.price=price;
		this.weight=weight;
		this.name=name;
		this.category=category;
		
	}

	
	
	@Override
	public String toString() {
		return "Chocolates [price=" + price + ", weight=" + weight + ", name=" + name + "]";
	}



	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}



	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}



	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public int getCategory() {
		return category;
	}

}
