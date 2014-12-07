import java.util.*;
import java.io.*;

public class SuperArray {

	/*	Modified from HW 15 to use an array of Strings		*/

    	private String[] data;	// Data Set, larger array
    	private int last; 	// Actual current length, not the data set

    	public SuperArray() {
        	// set up the initial instance variables
		// CREATE 16 BIT ALLOCATION
		data = new String[16];
		// Set default value to 0
		for (int i = 0; i < data.length; i++){
			data[i] = null;
		}
		last = 0;
    	}

    	public boolean add(String str){
        	// adds an item to the end of the list, grow if needed
        	// returns true
		try {
			if (size() == data.length){
				String[] buffer = new String[data.length + 1];
				for (int i = 0; i < data.length; i++){
					buffer[i] = data[i];
				}
				buffer[data.length] = str;
				data = buffer;
				last++;
			}
			else {
				data[last] = str;
				last++;
			}
			return true;
		} catch(Exception e){
			e.printStackTrace();
		}
		return false;
    	}

    	public void add(int index, String k){
        	// adds item i  at index, shifting everything down as needed.
        	// also grows as needed
		if (last < index) {last = index - 1;} //Grow!
		String[] buffer = new String[last + 1]; // OBOE! Off By One Error! Binary exploitation time :D
		try{
			for (int i = 0; i < buffer.length; i++){
				if (i < index){
					buffer[i] = data[i];
				}
				else if (i == index){
					buffer[i] = k;
				}
				else {
					buffer[i] = data[i - 1];
				}
			}
			data = buffer;
			last++;
		} catch(Exception e){e.printStackTrace();}

    	}

	public void isort() {
		for (int i = 1; i < last; i++){
			String temp = data[i];
			int j = 0;
			for (j = i; j > 0 && data[j - 1].compareTo(temp) > 0; j--){
				data[j] = data[j - 1];
			}
			data[j] = temp;
		}
	}

	public void ssort(){
		for (int i = 0; i < last; i++){
			String currMin = data[i];
			String tmp = "";
			int loc = 0;
			for (int j = i; j < last; j++){
				if (data[j].compareTo(currMin) <= 0){
					loc = j;
					currMin = data[j];
				}
			}
			tmp = data[i];
			data[i] = data[loc];
			data[loc] = tmp;
		}
	}

	public void bsort(){
		String temp = "";
		for (int i = 0; i < last - 1; i++){
			for (int j = i; j < last - 1; j++){
				if (temp.compareTo(data[j]) > 0){
					temp = data[j + 1];
					data[j + 1] = data[j];
					data[j] = temp;
				}
			}
		}
	}

    	public int size() {
        	// returns the number of items in the list (not the array size)
		return last;
    	}

    	public String get(int index) {
        	// returns the item at location index of the lsit
        	try{
	        	return data[index];
	        } catch(Exception e){System.out.println("Out of bounds.");}
	        return null;
    	}

    	public String set(int index, String str){
        	// sets the item at location index to value i
        	// returns the old value.
        	try{
        		String buffer = data[index];
        		data[index] = str;
        		return buffer;
        	} catch(Exception e){System.out.println("Out of bounds.");}
        	return null;
        	
    	}

    	public String remove(int index){
        	// removes the item at index i
        	// returns the old value
		String[] buffer = new String[size() - 1];
		String toReturn = null;
		for (int i = 0; i < buffer.length; i++){
			if (i < index){
                        	buffer[i] = data[i];
                        }
                        else if (i == index) {
                                //buffer[i] = obj;
                                toReturn = buffer[i];
                        }
                        else {
                                buffer[i] = data[i + 1];
                        }
                }
		last--;
		data = buffer;
		return toReturn;
    	}

	public void print(){
		System.out.print("[");
		for (int i = 0; i < last; i++){
			if (i == last - 1) {
				System.out.print(data[i]);
			} else {
				System.out.print(data[i] + ", ");
			}
		}
		System.out.println("]");
	}
}
