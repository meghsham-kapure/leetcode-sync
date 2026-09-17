public class Solution {

  public int search(int[] arr, int target) {

    int peak = findPeak(arr);

    if (target >= arr[0])
      return binarySearch(arr, target, 0, peak);
    else
      return binarySearch(arr, target, peak + 1, arr.length - 1);

  }

  public int binarySearch(int arr[], int target, int start, int end) {

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (arr[mid] == target)
        return mid;

      if (arr[mid] < target)
        start = mid + 1;
      else
        end = mid - 1;

    }

    return -1;

  }

  public int findPeak(int arr[]) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (arr[mid] >= arr[0])
        start = mid + 1;
      else
        end = mid - 1;

    }

    return end;
  }
}