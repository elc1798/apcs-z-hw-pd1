public class Search {

	public static Object linearSearch(Comparable[] c , Comparable t){
		for (int i = 0; i < c.length; i++){
			if (t.compareTo(c[i]) == 0){
				return c[i];
			}
		}
		return null;
	}

	public static Object binarySearch(Comparable[] c , Comparable t){

	}

	public static Object recursiveBinarySearch(Comparable[] c , Comparable t){

	}
}
