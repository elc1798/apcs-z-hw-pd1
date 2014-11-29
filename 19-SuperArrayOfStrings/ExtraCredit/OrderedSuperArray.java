import java.util.*;
import java.io.*;

public class OrderedSuperArray<TYPE> extends Sarray{
	
    	private TYPE[] data;	// Data Set, larger array
    	private int last; 	// Actual current length, not the data set

    	public OrderedSuperArray() {
        	// set up the initial instance variables
		// CREATE 16 BIT ALLOCATION
		data = (TYPE[]) new Object[0];
		// Set default value to 0
		for (int i = 0; i < data.length; i++){
			data[i] = null;
		}
		last = 0;
    	}

    	public boolean add(TYPE str){
        	// adds an item to the end of the list, grow if needed
        	// returns true
		try {
			if (size() == data.length){
				TYPE[] buffer = (TYPE[]) new Object[data.length + 1];
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
			sort();
			return true;
		} catch(Exception e){
			e.printStackTrace();
		}
		return false;
    	}
/*
    	public void add(int index, Object k){
        	// adds item i  at index, shifting everything down as needed.
        	// also grows as needed
		if (last < index) {last = index - 1;} //Grow!
		Object[] buffer = new Object[last + 1]; // OBOE! Off By One Error! Binary exploitation time :D
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
*/
    	public int size() {
        	// returns the number of items in the list (not the array size)
		return last;
    	}

	public void sort(){
		Arrays.sort(data);
/*
		for (int i = 1; i < last; i++){
			if (data[i].compareTo(data[i - 1]) < 0){
				Object temp = data[i - 1];
				data[i - 1] = data[i];
				data[i] = temp;
			}
		}
*/
	}

    	public Object get(int index) {
        	// returns the item at location index of the lsit
        	try{
	        	return data[index];
	        } catch(Exception e){System.out.println("Out of bounds.");}
	        return null;
    	}

    	public TYPE set(int index, TYPE i){
        	// sets the item at location index to value i
        	// returns the old value.
        	try{
        		TYPE buffer = data[index];
        		data[index] = i;
			//Arrays.sort(data);
			sort();
        		return buffer;
        	} catch(Exception e){System.out.println("Out of bounds.");}
        	return null;	
    	}

    	public TYPE remove(int index){
        	// removes the item at index i
        	// returns the old value
		TYPE[] buffer = (TYPE[]) new Object[size() - 1];
		TYPE toReturn = null;
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
