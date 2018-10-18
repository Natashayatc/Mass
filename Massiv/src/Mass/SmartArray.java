package Mass;
public class SmartArray<T> {
	 private final  T[] array;

	    public SmartArray(T[] array) {
	        this.array = array;
	        
	    }

	    public  String getElementToStringByIndex(int index) {
	        return "" + index + "=" + array[index].toString();
	      
	    }

	    public T[] swapAndReturn(int firstIndex, int secondIndex) {
	        T[] copy = array.clone();

	        copy[firstIndex] = array[secondIndex];
	        copy[secondIndex] = array[firstIndex];
	        return copy;
	    }

	    public T[] invertAndReturn() {
	        T[] copy = array.clone();

	        for(int i = 0; i < array.length; i++)
	            copy[array.length - i - 1] = array[i];

	        return copy;
	    }

	    public  T[] getArray() {
	        return array;
	    }
	    public static void main(String[] args) {
	    
		}
	}


