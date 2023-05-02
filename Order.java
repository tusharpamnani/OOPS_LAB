/*
Write a java program to display billing details containing information like customer id, product number, product name, quantity, and its cost. Calculate and display total amount with 10% GST on the cost. Create a class "Product" to declare the class variables and methods such as getdata(), calculate_gst() and display(). Create a main class of "Order".
*/

import java.util.Scanner;
class Product
{	
	Scanner s = new Scanner(System.in);
	int customer_id, product_number, quantity;
	String product_name;
	double product_cost, total_cost, gst_cost;

	void getdata()
	{
		customer_id = s.nextInt();
		quantity = s.nextInt();
		product_number = s.nextInt();
		product_name = s.nextLine();
		product_cost = s.nextDouble();
	}
	void calculategst()
	{
		total_cost = product_cost * quantity;
		gst_cost *= 0.1;
	}
	void display()
	{
		System.out.println("Customer ID: " + customer_id);
		System.out.println("Your total bill is $" + total_cost);
	}
}
class Order
{
	public static void main(String[] args)
	{
		Product p1 = new Product();
		p1.getdata();
		p1.calculategst();
		p1.display();
	
		Product p2 = new Product();
		p2.getdata();
		p2.calculategst();
		p2.display();
	
		Product p3 = new Product();
		p3.getdata();
		p3.calculategst();
		p3.display();
	}
}
