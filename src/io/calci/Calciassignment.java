package io.calci;

public class Calciassignment {
	public static void main(String[] args) {
		System.out.println("Enter your choice:");
		System.out.println("Press 1 for addition of integers:");
		System.out.println("Press 2 for substraction of intergers:");
		System.out.println("Press 3 for addition of floats:");
		System.out.println("Press 4 for substraction of floats:");
		System.out.println("press 5 for exit");
		
		
		int num1 = 0, num2 = 0,a;
		a=ConsoleInput.getInt();
		float num3 = 0,num4 = 0;
		
		if(a==1 || a==2)
		{
			 num1=ConsoleInput.getInt();
			num2=ConsoleInput.getInt();
		}
		else if(a==3 || a==4)
		{
			float num5=ConsoleInput.getFlost();
			float num6=ConsoleInput.getFlost();
		}
		Calculator objcal=new Calculator();
		
		while(a<=4)
		{
			
			
			
		
			
			switch(a)
			{
			case 1:
				
				System.out.println("Sum of int="+objcal.add(num1, num2));
				break;
			case 2:
				
				System.out.println("Sub of int="+objcal.sub(num1, num2));
				break;
			case 3:
				
				System.out.println("Sum of float="+objcal.add(num3, num4));
				break;
			case 4:
				
				System.out.println("Sub of float="+objcal.sub(num3, num4));
				break;
				default:
				System.out.println("invalid");
				
			}
			System.out.println("enter your choice:");
		     a=ConsoleInput.getInt();
			
			
		}
		
		
		
		
		
		
	}

}
