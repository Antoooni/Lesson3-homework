package by.htp.Array.launch;
import java.util.Random;
import java.util.Scanner;

import by.htp.Array.domain.FindMinMax;
import by.htp.Array.domain.IncreaseCapacity;
import by.htp.Array.domain.SortArrayAscending;
import by.htp.Array.domain.SotrArrayByDecreasing;

public class Main {

	public static void main(String[] args) {
		//create new array
		System.out.println("New array: ");
		Random rand = new Random();
		int array[]=new int[10];
		for(int i=0; i<array.length; i++){
			array[i]=rand.nextInt(10);
			System.out.print(array[i] + "  ");
		}
		System.out.println();
		
		//find Min & Max 
		FindMinMax e =new FindMinMax();
		e.findMin(array);
		e.findMax(array);
		
		//sort array
		SortArrayAscending gnome = new SortArrayAscending();
		gnome.gnomeSort(array);
		
		SotrArrayByDecreasing gnomeDecrease = new SotrArrayByDecreasing();
		gnomeDecrease.gnomeSort(array);
		
		//adding new element
		String answer;
		System.out.println("Do you want to increase your array? ");
		boolean result=true;
		int newValue=99;
		IncreaseCapacity inc =new IncreaseCapacity(array, newValue);
		do{
			Scanner sc= new Scanner(System.in);
			answer=sc.nextLine();
			switch(answer){
			case "yes":{
				System.out.println("which value of new element?");
				answer=sc.nextLine();
				//validate data
				boolean inputed = inc.checkString(answer);
				if (inputed==true){
					int numb = Integer.parseInt(answer);
					array =inc.increaseCapacity(array,numb);
					
				}
					else{
						System.out.println("Available only numbers!");
					}
				}
			System.out.println("Add more?");
				break;
			case "no": result=false;
				break;
				default: System.out.println("Available only yes/no answers");
			}
		}
		while(result==true);
	}

	
		
	
	
}