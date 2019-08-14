package random;

import java.util.Scanner;

public class Java99 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner input = new Scanner(System.in);
		int x, y;//記憶輸入
		String which;//記憶輸入
		
		
		while (true) {			
			System.out.println("請輸入選擇查詢方法：" + "1：自訂\t2：數字查詢\t3:99乘法總覽");
			which = input.nextLine();	
			
			if (which.equals("1")) {//自訂數字相乘

				System.out.println("請輸入要相乘的數字");
				System.out.print("數字:");
				x = input.nextInt();
				System.out.print("數字:");
				y = input.nextInt();
				System.out.println("相乘結果:" + x * y);
				break;
				
			} else if (which.equals("2")) {//輸入n則列出n的乘法表
				
				System.out.println("請輸入數字查詢");
				x = input.nextInt();
				for (int i = 1; i <= 9; i++) {
					System.out.println(x + "*" + i + "=" + i * x);
				}
				break;

			} else if (which.equals("3")) {//99乘法表
				
				for (int i = 1; i <= 9; i++) {
					for (int j = 1; j <= 9; j++) {
						System.out.printf("%d*%d=%d\t", j, i, i * j);
					}
					System.out.println();
				}
				break;

			} else {//例外處理				
				System.out.println("Error：請輸入正確選項");				
			}
			
		}

	}

}
