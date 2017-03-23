package by.htp.Array.domain;

public class FindMinMax {
	public void findMin(int[] array){
		int min = array[0];
		for(int i=0; i<10; i++){
			for(int el: array) {
				if (el<min) min=el;
			}
		}
		System.out.println("Min element: "+min);
		
	}
	public void findMax(int[] array){
		int min = array[0];
		for(int i=0; i<10; i++){
			for(int el: array) {
				if (el>min) min=el;
			}
		}
		System.out.println("Max element: "+min);
	}

}
