package testp;

import java.util.Scanner;

public class Ball {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		double PI = Math.PI;//Java.lang.math
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��İ뾶Ϊ��");
		
		int r = sc.nextInt();
		
		System.out.println("������Ϊ:" + r*PI*r*r*4.0/3.0);
		
		
	}

}
