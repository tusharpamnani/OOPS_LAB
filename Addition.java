/*
This is a program to add two numbers taken from the user. 
*/
import java.util.Scanner;
class Add
{
	Scanner s = new Scanner(System.in);
	int n1,n2,sum=0;
	void getdata()
	{
		System.out.println("Enter two numbers");
		n1 = s.nextInt();
		n2 = s.nextInt();
	}
	void Sum()
	{
		sum = n1 + n2;
	}
	void Display()
	{
		System.out.println("Sum="+sum);
	}
}
class Addition
{
	public static void main(String[] args)
	{
		Add a1 = new Add();
		a1.getdata();
		a1.Sum();
		a1.Display();
	}
}
	
