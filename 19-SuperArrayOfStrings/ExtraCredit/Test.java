public class Test{
	public static void one(){
		OrderedSuperArray<String> OSA = new OrderedSuperArray();
		OSA.print();
		OSA.add("A");
		OSA.add("Z");
		OSA.add("ABRACADABRA");
		OSA.add("abcsdasdflai1asdf");
		OSA.add("lalskddajalsldljasf");
		OSA.add("jfjfjfjaososodl");
		OSA.print();
	}

	public static void two(){
		OrderedSuperArray<Integer> OSA = new OrderedSuperArray();
		OSA.print();
		OSA.add(10123);
		OSA.add(19121);
		OSA.add(1234);
		OSA.add(1);
		OSA.add(-1239191);
		OSA.add(1929191111);
		OSA.print();
	}

	public static void three(){
		OrderedSuperArray<Character> OSA = new OrderedSuperArray();
		OSA.print();
		OSA.add('A');
		OSA.add('a');
		OSA.add('Z');
		OSA.add('z');
		OSA.add('o');
		OSA.print();
	}

	public static void main(String[] args){
		one();
		two();
		three();
	}

}
