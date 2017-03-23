package by.htp.Array.domain;

public class SortArrayAscending {
	public void gnomeSort(int array[]){
		System.out.println("Sorted array ascending order: ");
		 int i = 1;
		 while(i < array.length) {
			          if(i == 0 || array[i - 1] <= array[i])
			              i++;
			         else {
			              int temp = array[i];
			              array[i] = array[i - 1];
			              array[i - 1] = temp;
			             i--;
			         }
			     }
		
		for(int j=0; j<array.length; j++){
			System.out.print(array[j] + "  ");
		}
		System.out.println();
	}

}
