
public class IntByteShortLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short myShortValue=400;
		int myIntValue=300;
		byte myByteValue=100;
		long myLongValue=200l;
		
		long l=(myShortValue)+(myIntValue)+(myByteValue)+(myLongValue);
		System.out.println(l);
		
		//short s= ((myShortValue)+(myIntValue)+(myByteValue)+(myLongValue));
	//	System.out.println(s);

		byte b= (byte) ((myShortValue)+(myIntValue)+(myByteValue)+(myLongValue));
		System.out.println(b);

		int i= (int) ((myShortValue)+(myIntValue)+(myByteValue)+(myLongValue));
		System.out.println(i);
		
		

	}

}
