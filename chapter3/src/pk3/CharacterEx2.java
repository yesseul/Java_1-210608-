package pk3;

public class CharacterEx2 {

	public static void main(String[] args) {
		
		int a=65; //대문자 A
		//int a=97; //소문자 a
		
		System.out.println(a);
		System.out.println((char)a); //형변환(ASCII 코드)
		
		System.out.println("========================");
		//int와 char는 호환이 가능하지만 음수는 호환되지 않는다
		int b=-66;
		
		System.out.println(b);
		System.out.println((char)b);
		
		System.out.println("========================");
		char a2=65; //ASCII 코드
		//char b2=-66; //오류
		System.out.println(a2);
		System.out.println((int)a2);

	}

}
