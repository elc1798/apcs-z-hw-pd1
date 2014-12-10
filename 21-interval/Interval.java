import java.io.*;
import java.util.*;

public class Interval{
	private double low, high;
	private Random numgen = new Random();

	public Interval(double l , double h){
		low = l;
		high = h;
	}

	public Interval(){
		low = numgen.nextDouble() * 100;
		high = numgen.nextDouble() * 100 + low;
	}

	public void setLow(double n){
		low = n;
	}

	public void setHigh(double n){
		high = n;
	}

	public double getLow(){
		return low;
	}

	public double getHigh(){
		return high;
	}

	public String toString(){
		String s = "(" + low + " , " + high + ")";
		return s;
	}

	public static String toString(Interval v){
		return v.toString();
	}

	public static boolean overlap(Interval a , Interval b){
		return !((a.getLow() >= b.getHigh() && a.getHigh() >= b.getHigh()) || (b.getLow() >= a.getHigh() && b.getHigh() >= a.getHigh()));
	}

	public static Interval union(Interval a , Interval b){
		if (overlap(a , b)){
			double hi = Math.max(a.getHigh() , b.getHigh());
			double lo = Math.min(a.getLow() , b.getLow());
			return new Interval(lo , hi);
		} else {
			return null;
		}
	}

	public static Interval intersection(Interval a , Interval b){
		if (overlap(a , b)){
			double hi = Math.min(a.getHigh() , b.getHigh());
			double lo = Math.max(a.getLow() , b.getLow());
			return new Interval(lo , hi);
		} else {
			return null;
		}
	}

	public int compareTo(Interval b){
		int diffLow = (int)(this.getLow() - b.getLow());
		int diffHigh = (int)(this.getHigh() - b.getHigh());
		int diffRange = (int)((this.getHigh() - this.getLow()) - (b.getHigh() - b.getLow()));
		if (diffLow == 0) {
			return diffHigh;
		} else {
			if (diffRange == 0) {
				return diffLow;
			} else {
				return diffRange;
			}
		}
	}

	public static int compareTo(Interval a , Interval b){
		return a.compareTo(b);
	}
}
