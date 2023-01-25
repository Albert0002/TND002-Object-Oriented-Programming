package lecture5;

/**
 * @author Albert
 * @version 1.0
 * @since 2023-01-25
 * Custom ArrayList
 */

public class DynamicArray {
	private int[] theArray;
	
	public DynamicArray() {
		theArray = null;
	}

	public int addElement(int arg) {
		
		if (theArray == null) {
			theArray = new int[1];
			theArray[0] = arg;
			
		} else {
			int[] temp = new int[theArray.length + 1];
			
			for (int i = 0; i < theArray.length; i++) {
				temp[i] = theArray[i];
			}
			
			temp[theArray.length] = arg;
			theArray = temp;
			
		}
		return theArray.length;
	}
}
