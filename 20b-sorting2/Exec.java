public class Exec{
	public static void main(String[] args){
		SuperArray test = new SuperArray();
		test.add("hi");
		test.add("bye");
		test.add("the");
		test.add("moo");
		test.add("cow");
		test.add("has");
		test.add("chocolate");
		test.add("milk");
		test.print();
		SuperArray save = test;
		test.isort();
		test.print();
		test = save;
		test.ssort();
		test.print();
		test = save;
		test.bsort();
		test.print();
	}
}
