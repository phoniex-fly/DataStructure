package Study.Algorithm.sort.mergeSort;

import java.util.Arrays;

import Study.Algorithm.sort.Sort;

public class MergeSort extends Sort {

	@Override
	public void concreteSort() {
		sort(0, array.length);
	}

	/**
	 * 将[begin,end)范围内的数据进行切分
	 * 
	 * @param begin
	 * @param end
	 */
	public void sort(int begin, int end) {
		int mid = (begin + end) >> 1;
		sort(begin, mid);
		sort(mid, end);
		merge(begin, mid, end);
	}

	/**
	 * 将[begin,mid),[mid,end)数组合并
	 * 
	 * @param begin
	 * @param mid
	 * @param end
	 */
	private void merge(int begin, int mid, int end) {
		int[] arr = Arrays.copyOfRange(array, begin, mid);
	}

}
