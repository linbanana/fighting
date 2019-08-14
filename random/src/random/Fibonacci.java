package random;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner input = new Scanner(System.in);

		int num1 = 0, num2 = 1, num3;
		System.out.print("請輸入您要顯示的費氏數列總數：");
		int count = input.nextInt();//費氏數列總數

		System.out.print(num1 + " " + num2);

		for (int i = 2; i < count; ++i)//已有"0"和"1"，所以"i"從"2"開始
		{
			num3 = num1 + num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}

	}

}
