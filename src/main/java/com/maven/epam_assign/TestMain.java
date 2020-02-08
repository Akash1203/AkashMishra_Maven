package com.maven.epam_assign;
import java.util.*;

public class TestMain {
	
		static List<Sweets> sweets=new ArrayList<Sweets>();
		static List<Chocolates> chocolates=new ArrayList<Chocolates>();
		
		static Scanner sc=new Scanner(System.in);
		
		public static void main(String[] args) {

			inputSweets();
			inputChocloates();
			
			while(true)
			{
				System.out.println("===================MENU====================");
				System.out.println("1) Display Gifts");
				System.out.println("2) Display the total weight of the gift");
				System.out.println("3) View The Candies In The Gift");
				System.out.println("4) Apply Filter");
				System.out.println("5) Exit");
				System.out.println("===========================================");
				int choice=sc.nextInt();
				 switch(choice)
				 {
				 case 1:
					 display();
					 break;
				 case 2:
					 System.out.println("Total weight of the gift is : "+calcWeight());
					 break;
				 case 3:
					 System.out.println("The Candies are:");
					 candyDisplay();
					 break;
				 case 4:
					 System.out.println("Filter the chocolates and sweets according to: \n 1.Price \n 2.Weight");
					 int ch=sc.nextInt();
					 filter(ch);
					 break;
				 case 5:
					 System.out.println("ThankYou");
					 System.exit(0);
				default:
					 System.out.println("Invlaid Choice!!");
				 }
			}
		}
		public static void inputSweets()
		{
			
			System.out.println("Enter the no of sweets:");
			for(int n=sc.nextInt();n>0;n--)
			{
				System.out.println("Enter the weight of the sweet:");
				double weight=sc.nextDouble();
				System.out.println("Enter the price of the sweet:");
				double price=sc.nextDouble();
				System.out.println("Enter the name of the sweet:");
				String name=sc.next();
				Sweets sweet=new Sweets(price,weight,name);
				sweets.add(sweet);
			}
		}
		
		
		public static void inputChocloates()
		{
			
			System.out.println("Enter the no of chocolates:");
			for(int n=sc.nextInt();n>0;n--)
			{
				System.out.println("Enter the weight of the chocolate:");
				double weight=sc.nextInt();
				System.out.println("Enter the price of the chocolate:");
				double price=sc.nextInt();
				System.out.println("Enter the type of chocolate: 1.Candy 2.Chocolate");
				int category=sc.nextInt();
				System.out.println("Enter the name of the chocolate:");
				String name=sc.next();
				Chocolates chocolate=new Chocolates(price,weight,name,category);
				chocolates.add(chocolate);
			}
		}	
		
		public static double calcWeight()
		{
			double totalWeight=0;
			for(Chocolates choco:chocolates)
				totalWeight+=choco.getWeight();
			for(Sweets sweet:sweets)
				totalWeight+=sweet.getWeight();
			
			return totalWeight;
		}
		
		public static void candyDisplay()
		{
			for(Chocolates choco:chocolates)
			{
				if(choco.getCategory()==1)
					System.out.println(choco.toString());
			}
		}
		
		public static void filter(int ch) 
		{
			double lower,higher;
			if(ch==1)
			{
				System.out.println("Enter the lower price limit:");
				lower=sc.nextDouble();
				System.out.println("Enter the upper price limit:");
				higher=sc.nextDouble();
				for(Chocolates choco:chocolates)
				{
					if(choco.getPrice()>=lower&&choco.getPrice()<=higher)
						System.out.println(choco.toString());
				}
				for(Sweets sweet:sweets)
				{
					if(sweet.getPrice()>=lower&&sweet.getPrice()<=higher)
						System.out.println(sweet.toString());
				}
			}
			else
			{
				System.out.println("Enter the lower weight limit:");
				lower=sc.nextDouble();
				System.out.println("Enter the upper weight limit:");
				higher=sc.nextDouble();
				for(Chocolates choco:chocolates)
				{
					if(choco.getWeight()>=lower&&choco.getWeight()<=higher)
						System.out.println(choco.toString());
				}
				for(Sweets sweet:sweets)
				{
					if(sweet.getWeight()>=lower&&sweet.getWeight()<=higher)
						System.out.println(sweet.toString());
				}
			}
		}
		
		public static void display()
		{
			for(Chocolates choco:chocolates)
					System.out.println(choco.toString());
			for(Sweets sweet:sweets)
					System.out.println(sweet.toString());
		}
	}