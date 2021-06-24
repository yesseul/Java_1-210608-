package pk3;
//자바 버전10 이상
public class TypeInference {

	public static void main(String[] args) {

		int i=10;
		var j=10.0;  //double j=10.0;
		var str="hello"; //string str="hello"
		
		i=100;
		str="test";
		j=10.5;
		
		//str=3; 타입오류
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);

	}

}
