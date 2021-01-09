package Study.Algorithm.sort;

import java.util.Arrays;

import Study.Algorithm.sort.uncmp.CountingSort;

public class Client {
	public static void main(String[] args) {
		// 初始化数组
		int[] array = { 6, 57, 72, 22, 4, 77, 5, 39 };
		// 排序
		Sort sort = new CountingSort();
		sort.sort(array);
		// 输出结果
		System.out.println(Arrays.toString(array));
		System.out.print("比较次数：" + sort.compareCount + ",交换次数" + sort.swapCount);
	}
}
