public class binarySearch {
	public static void main(String[] args) {
		int[] list = {1, 3, 5, 7, 9};
		System.out.println("元素3的位置：" + binarySearch(list, 3));
		System.out.println("元素-1的位置：" + binarySearch(list, -1));
	}

	/** 二分查找一个有序数组 
	 * list:需要查找的有序数组
	 * item:要查找的那个数，未找到返回值-1
	 */
	public static int binarySearch(int[] list, int item) {
		int low = 0;
		int high = list.length - 1;

		while(low <= high) {
			int mid = (low + high) / 2;
			int guess = list[mid];

			if (guess == item) {
				return mid;
			}
			else if (guess > item) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return -1;	
	}
}