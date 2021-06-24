package pk3;

public class ByteVariable {

	public static void main(String[] args) {
		byte bs1=-128;  //8비트 -128 ~ 127(+0)
		byte bs2=127;  
		//byte bs2=128 오류
		  
		short s=32767;   //16비트 -32768 ~ 32767
		//short s=33000; 오류 
		
		
		System.out.println(bs1);
		System.out.println(bs2);
		System.out.println(s);
		

	}

}
