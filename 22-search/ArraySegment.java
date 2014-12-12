public class ArraySegment{
	private Object[] internalData;
	private int internalHigh;
	private int internalLow;

	public ArraySegment(){

	}
	public ArraySegment(Object[] objAry, int lowIndex, int highIndex){
		internalData = objAry;
		internalLow = lowIndex;
		internalHigh = highIndex;
	}
	public Object get(int index){
		try{
			return internalData[internalLow + index];
		} catch(Exception e){
			System.exit(0);
		}
		return null;
	}
	public int length(){
		return internalHigh - internalLow + 1;
	}
	public int virtualLow(){
		return internalLow;
	}
	public int virtualHigh(){
		return internalHigh;
	}
	public String toString(){
		return "DATA[" + internalLow + " : " + internalHigh + "]";
	}
}
