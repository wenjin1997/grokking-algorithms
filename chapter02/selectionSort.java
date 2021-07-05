// 选择排序
public class selectionSort {
	public static void main(String[] args) {

	}

	public static int findSmallest(ArrayList arr) {
		smallest = arr[0];
		smallest_index = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
				smallest_index = i;
			}
		}
		return smallest_index;
	}

	public static int[] selectionSort(ArrayList arr) {
		ArrayList newArr = new ArrayList();
		

	}
}