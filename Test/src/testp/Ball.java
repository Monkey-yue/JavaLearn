package testp;

import java.util.Scanner;

public class Ball {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double PI = Math.PI;//Java.lang.math
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("球的半径为：");
		
		int r = sc.nextInt();
		
		System.out.println("球的体积为:" + r*PI*r*r*4.0/3.0);
		
		
	}

}
