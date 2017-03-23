package by.htp.Array.domain;

public class SotrArrayByDecreasing {
	public void gnomeSort(int array[]){
		System.out.println("Sorted array by decreasing order: ");
		
		int i = 10;
		while(i !=0) {
			if(i == 10 ||array[i - 1] >= array[i])
				i--;
			else{
				int temp = array[i];
				array[i] = array[i - 1];
				array[i - 1] = temp;
				i++;
//				
			}
		}
		for(int j=0; j<array.length; j++){
			System.out.print(array[j] + "  ");
		}
		System.out.println();
	}

}
