package testp;

import java.util.Scanner;

public class SimpleJisuan {
	public static void main (String[] args) {
		
		System.out.println("输入两个数字：");
		
		Scanner sc = new Scanner(System.in);
		
		double s1 = sc.nextInt();
		double s2 = sc.nextInt();
		
		System.out.println("num1+num2的和为：" + (s1+s2));
		System.out.println(("num1-num2的差为：" + (s1-s2)));
		System.out.println("num1*num的积为：" + (s1*s2));
		System.out.println("num1/num2的商为：" + (s1/s2));
		System.out.println("num1%num2的余数为：" + (s1%s2));
	}
}
