package pk3;

public class ImplicitConversion {

	public static void main(String[] args) {
		//묵시적 형변환
		byte bNum=10;  //8비트
		int iNum=bNum;  //32비트
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2=20;
		float fNum=iNum2;
		
		System.out.println(iNum2);
		System.out.println(fNum);

		double dNum;
		dNum=fNum+iNum;
		System.out.println(dNum);
	}

}
