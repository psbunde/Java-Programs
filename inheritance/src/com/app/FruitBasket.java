package com.app;
import com.app.fruits.*;
import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) 
	{
	boolean exit = false;
	int counter = 0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Basket Size: ");
	Fruit[] f = new Fruit[sc.nextInt()];
	
	
	//String clr, double wt,String nm, boolean frh
	while(!exit)
	{
			
	System.out.println("1. Add Mango\n2. Add Orange\n3. Add Apple\n4. Show Basket\n5. Get Taste\n"
			+ "6. Display Fresh Fruits\n7. Mark Fruit as Stale(Using Index)\n8. Mark all sour fruits stale\n"
			+ "9. Invoke Fruit Specific Functionality\n999. Exit");
	switch(sc.nextInt())
	{
	case 1:
			f[counter] = new Mango("Golden",2.8,"Hapus",true);
			System.out.println("A Mango Has Been Added To Your Cart\n");
			counter++;
			break;
			
	case 2: 
			f[counter] = new Orange("Orange",1.3,"Nagpuri",true);
			System.out.println("An Orange Has Been Added To Your Cart\n");
			counter++;
			break;
			
	case 3:
			f[counter] = new Apple("Red",0.9,"Kashmiri",true);
			System.out.println("An Apple Has Been Added To Your Cart\n");
			counter++;
			break;
			
	case 4: 
			for(Fruit a : f)
			{
				System.out.println(a);
			}
			break;
	
	case 5:
			for(Fruit a : f)
			{
				System.out.println(a.taste());
			}
			
	case 6: 
		for(Fruit a : f)
		{
			if(a.isFresh())
				System.out.println(a);
		}
		break;
		
	case 7:
		for(Fruit a : f)
		{
			System.out.println(a);
		}
		
		System.out.println("Enter index of the fruit which u want to mark as stale: ");
		int index = sc.nextInt()-1;
		if(index > counter || index < 0)
		{
			System.out.println("Invalid Index");
			break;
		}
	
		f[index].setFresh(false);
		break;
		
	case 8:
		for(int i = 0; i<f.length;i++)
		{
			if(f[i].taste()=="sour")
			{
				f[i].setFresh(false);
			}
		}
		break;
		
	case 9:
			System.out.println("Enter index of fruit to call its specific functionality: ");
			index = sc.nextInt()-1;
			if(index > counter || index < 0)
			{
				System.out.println("Invalid Index");
				break;
			}
			Fruit a = f[index];
			if(a instanceof Mango)
			{
				Mango m = (Mango) a;
				m.pulp();
			}
			else if(a instanceof Orange)
			{
				Orange o = (Orange) a;
				o.juice();
			}
			else 
			{
				Apple p = (Apple) a;
				p.jam();
			}		
		break;
		
	case 999:
		exit = true;
		break;
	}
	}
	sc.close();
	}

}
