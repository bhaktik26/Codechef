package codechef.binarysearch;

// ceil(x) - smallest no greater than or equal to x
public class CeilBinarySearch {

	// arr must be sorted
	public static void main(String[] args) {
		int arr[] = { 1, 2, 8, 10, 12, 19 };
		int high = arr.length - 1;
		int val = 7;
		int ans = ceilSearch(arr, 0, high, val);
		System.out.println("Index of ceil: " + ans);
		System.out.println("Ceil value: " + arr[ans]);
	}

	static int ceilSearch(int arr[], int low, int high, int val) {
		int mid;

		// the element is the smallest one greater than or equal to value
		if (val <= arr[low])
			return low;

		// if the value is larger than the last element, there is no ceil
		if (val > arr[high])
			return -1;

		// Now apply binary search, calculate the mid
		mid = (low + high) / 2;

		// check if the value is equal to mid, the ceil index is mid
		if (arr[mid] == val)
			return mid;

		// check if value is greater than mid, then search will happen only in
		// second half of array
		else if (val > arr[mid]) {
			if (mid + 1 <= high && val <= arr[mid + 1])
				return mid + 1;
			else
				return ceilSearch(arr, mid + 1, high, val);
		}
		// value is less than mid
		else {
			if (low <= mid - 1 && val > arr[mid - 1])
				return mid;
			else
				return ceilSearch(arr, low, mid - 1, val);
		}
	}
}
