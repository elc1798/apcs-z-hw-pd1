import java.util.*;

public class Searching{

	private static Comparable[] testAry;

	public Searching(int n){
		testAry = new Comparable[n];
	}

	public void addItem(Comparable c , int i){
		testAry[i] = c;
	}

	public static void main(String[] args){
		Searching testSearch = new Searching(20);
		for (int i = 0; i < 20; i++){
			testSearch.addItem(Integer.valueOf(i) , i);
		}
		try {
			if (args[0].toUpperCase().equals("LINEAR")) {
				System.out.println(Search.linearSearch(testAry , Integer.valueOf(1)));
				System.out.println(Search.linearSearch(testAry , Integer.valueOf(100)));
			} else if (args[0].toUpperCase().equals("BINARYLOOP")){
				System.out.println(Search.binarySearch(testAry , Integer.valueOf(1)));
				System.out.println(Search.binarySearch(testAry , Integer.valueOf(100)));
			} else {
				System.out.println(Search.recursiveBinarySearch(testAry , Integer.valueOf(1)));
				System.out.println(Search.recursiveBinarySearch(testAry , Integer.valueOf(100)));
			}
		} catch(Exception e){
			System.out.println(Search.recursiveBinarySearch(testAry , Integer.valueOf(1)));
			System.out.println(Search.recursiveBinarySearch(testAry , Integer.valueOf(100)));
		}
	}

}
