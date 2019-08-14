package random;

import java.util.*;

public class Random {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();// 泛型

		int count, minnum, maxnum;
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int size = numbers.size();
		int which;// 記憶輸入

		System.out.println("請問您要抽幾次不同的幸運數字?");
		count = input.nextInt();
		System.out.println("設定數字範圍，最小數字與最大數字");
		System.out.println("最小數字是多少呢?");
		minnum = input.nextInt();
		System.out.println("最大數字是多少呢?");
		maxnum = input.nextInt();

		if (maxnum - minnum + 1 >= count) {
			System.out.println("請輸入選擇查詢方法：" + "1:Random　2:ArrayList");// Random有bug..
			which = input.nextInt();

			if (which == 1) {
				try {
					for (int i = 0; i <= maxnum - minnum; i++)
						numbers.add(minnum + i);

					int[] result = new int[count];
					for (int i = 0; i < result.length; i++) {

						int index = (int) (Math.random() * (maxnum - minnum + 1)) + minnum;//Random
						result[i] = index;
						numbers.remove(new Integer(index));

					}

					Arrays.sort(result);//排序
					System.out.println("Lucky numbers: ");
					for (int i : result) {
						System.out.print(i + " ");
					}

				} catch (Exception e) {
					e.toString();

				}
			} else if (which == 2) {//ArrayList

				for (int i = 0; i <= maxnum - minnum; i++)
					numbers.add(minnum + i);

				int index[] = new int[count];
				Collections.shuffle(numbers); //隨機排序
				System.out.println("Lucky numbers: ");
				
				for (int i = 0; i < count; i++) {
					index[i] = numbers.get(i);
					System.out.print(index[i] + " ");
				}

			} else {
				System.out.println("請輸入正確選項");
			}

		} else {
			System.out.print("最小值+最大值應大於等於抽取次數");
		}

		System.exit(0);//JVM錯誤排除
	}

	private int nextInt(int minnum, int maxnum) {
		// TODO 自動產生的方法 Stub
		return 0;
	}

}
