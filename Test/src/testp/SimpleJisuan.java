package testp;

import java.util.Scanner;

public class SimpleJisuan {
	public static void main (String[] args) {
		
		System.out.println("�����������֣�");
		
		Scanner sc = new Scanner(System.in);
		
		double s1 = sc.nextInt();
		double s2 = sc.nextInt();
		
		System.out.println("num1+num2�ĺ�Ϊ��" + (s1+s2));
		System.out.println(("num1-num2�Ĳ�Ϊ��" + (s1-s2)));
		System.out.println("num1*num�Ļ�Ϊ��" + (s1*s2));
		System.out.println("num1/num2����Ϊ��" + (s1/s2));
		System.out.println("num1%num2������Ϊ��" + (s1%s2));
	}
}
