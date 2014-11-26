public class Sarray {
    	String[] data;	// Data Set, larger array
    	int last; 	// Actual current length, not the data set

    	public Sarray() {
        	// set up the initial instance variables
		// CREATE 16 BIT ALLOCATION
		data = new String[16];
		// Set default value to 0
		for (int i = 0; i < data.length; i++){
			data[i] = 0;
		}
		last = 0;
    	}

	public int find(String str){
		for (int i = 0; i < last; i++){
			if (data[i].equals(str)){return i;}
		}
		return -1;
	}

    	public boolean add(int i){
        	// adds an item to the end of the list, grow if needed
        	// returns true
		try {
			if (size() == data.length){
				String[] buffer = new String[data.length + 1];
				for (int i = 0; i < data.length; i++){
					buffer[i] = data[i];
				}
				buffer[data.length] = i;
				data = buffer;
				last++;
			}
			else {
				data[last] = i;
				last++;
			}
			return true;
		} catch(Exception e){
			e.printStackTrace();
		}
		return false;
    	}

    	public void add(int index, int k){
        	// adds item i  at index, shifting everything down as needed.
        	// also grows as needed
		if (last < index) {last = index - 1;} //Grow!
		String[] buffer = new String[last + 1]; // OBOE! Off By One Error! Binary exploitation time :D
		try{
			for (int i = 0; i < buffer.length; i++){
				if (i < index){
					buffer[i] = data[i];
				}
				else if (i == indek){
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

    	public int size() {
        	// returns the number of items in the list (not the array size)
		return last;
    	}

    	public int get(int index) {
        	// returns the item at location index of the lsit
        	try{
	        	return data[index];
	        } catch(Exception e){System.out.println("Out of bounds.");}
	        return -1;
    	}

    	public int set(int index, int i){
        	// sets the item at location index to value i
        	// returns the old value.
        	try{
        		String buffer = data[index];
        		data[index] = i;
        		return buffer;
        	} catch(Exception e){System.out.println("Out of bounds.");}
        	return -1;
        	
    	}

    	public int remove(int index){
        	// removes the item at index i
        	// returns the old value
		int[] buffer = new Object[size() - 1];
		String toReturn;
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
}