import java.util.*;
import java.io.*;

public class Exec{

	static Interval[] collections = new Interval[10];

	public static void main(String[] args){
		for (int i = 0; i < 10; i++){
			collections[i] = new Interval();
			System.out.println(Interval.toString(collections[i]));
		}
		Interval test1 = new Interval(0 , 10);
		Interval test2 = new Interval(5 , 15);
		Interval test3 = new Interval(13 , 20);
		Interval test4 = new Interval(0 , 20);

		System.out.println(Boolean.toString(Interval.overlap(test1 , test2)));		//Should be TRUE
		System.out.println(Boolean.toString(Interval.overlap(test2 , test3)));		//Should be TRUE
		System.out.println(Boolean.toString(Interval.overlap(test1 , test3)));		//Should be FALSE
		System.out.println(Boolean.toString(Interval.overlap(test4 , test2)));		//Should be TRUE

		System.out.println(Interval.toString(Interval.union(test1 , test2)));		//Should be (0 , 15)
		System.out.println(Interval.toString(Interval.intersection(test1 , test2)));	//Should be (5 , 10)
		System.out.println(test1.compareTo(test2));					//Something negative
		System.out.println(Interval.compareTo(test1 , test2));				//Should be same as above
		System.out.println(test2.compareTo(test1));					//Should be something positive
		System.out.println(test4.compareTo(test3));					//Should be something positive
		System.out.println(test1.compareTo(test1));					//Should be 0
	}
}
