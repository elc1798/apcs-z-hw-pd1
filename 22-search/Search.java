import java.util.Arrays;

public class Search {

	public static Object linearSearch(Comparable[] c , Comparable t){
		Arrays.sort(c);
		for (int i = 0; i < c.length; i++){
			if (t.compareTo(c[i]) == 0){
				return c[i];
			}
		}
		return null;
	}

	public static Object binarySearch(Comparable[] c , Comparable t){
		Arrays.sort(c);
		int index = (int)(c.length / 2);
		ArraySegment seg = new ArraySegment(c , 0 , c.length - 1);
		while (seg.length() > 1){
			index = (int)(seg.length() / 2) + seg.virtualLow();
			if (t.compareTo(seg.get(index - seg.virtualLow())) > 0) {
				seg = new ArraySegment(c , index , seg.virtualHigh());
			} else if (t.compareTo(seg.get(index - seg.virtualLow())) < 0) {
				seg = new ArraySegment(c , seg.virtualLow() , index);
			} else {
				return (seg.get(index));
			}
		}
		if (t.compareTo(seg.get(0)) == 0){
			return seg.get(0);
		} else {
			return null;
		}
	}

	private static Object rbs(Comparable[] c , Comparable t , int upper , int lower){
		if (upper - lower <= 1){
			try {
				if (t.compareTo(c[lower]) == 0){
					return (Object)c[lower];
				} else {
					return null;
				}
			} catch(Exception e){
				return null;
			}
		}
		int i = lower + (int)((upper - lower) / 2);
		Object obj;
		if (t.compareTo(c[i]) > 0){
			obj = rbs(c , t , upper , i);
		} else if (t.compareTo(c[i]) < 0){
			obj = rbs(c , t , i , lower);
		} else {
			obj = c[i];
		}
		return obj;
	}

	public static Object recursiveBinarySearch(Comparable[] c , Comparable t){
		Arrays.sort(c);
		Object obj = rbs(c , t , c.length - 1 , 0);
		return obj;
	}
}
