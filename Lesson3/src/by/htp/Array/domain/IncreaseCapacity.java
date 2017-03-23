package by.htp.Array.domain;

public class IncreaseCapacity {
	

	public   IncreaseCapacity(int[] array,int newValue) {
	}

	public int[] increaseCapacity(int[] array,int numb) {
		// define capacity curent array
		int size=array.length;
		int array2[]=new int[size+1];
		System.arraycopy(array, 0, array2, 0, size);
		int max= array2.length;
		System.out.println("Increased size to: "+max);
		System.out.println("New array now: ");
		array2[max-1]=numb;
		for(int i=0; i<array2.length; i++){
			System.out.print(array2[i]+ "  ");
		}
		System.out.println();
		array=array2;
		return array;
	}

	public boolean checkString(String string) {
        
		try {
        	Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
