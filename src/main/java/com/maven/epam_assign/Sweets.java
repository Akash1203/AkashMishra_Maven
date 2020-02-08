package com.maven.epam_assign;


public class Sweets implements Gift{

		double price,weight;
		String name,category;
		public Sweets(double price,double weight,String name)
		{	
			this.price=price;
			this.weight=weight;
			this.name=name;
		}
		
		

		public String getCategory() {
			// TODO Auto-generated method stub
			return category;
		}
		@Override
		public String toString() {
			return "Sweets [price=" + price + ", weight=" + weight + ", name=" + name + "]";
		}



		public double getPrice() {
			// TODO Auto-generated method stub
			return 0;
		}



		public double getWeight() {
			// TODO Auto-generated method stub
			return 0;
		}



		public String getName() {
			// TODO Auto-generated method stub
			return null;
		}

	}