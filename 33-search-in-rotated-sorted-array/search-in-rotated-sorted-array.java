public class Solution {

  public int search(int[] arr, int target) {

    int peak = findPeak(arr);
        System.out.println(arr[peak]);

    int result = -1;

    // if (arr.length < 3) {
    //   result = binarySearch(arr, target, 0, arr.length - 1);
    //   return result;
    // }
    if (target >= arr[0])
      result = binarySearch(arr, target, 0, peak);
    else
      result = binarySearch(arr, target, peak + 1, arr.length - 1);

    return result;
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
    int mid = 0;
    int end = arr.length - 1;

    while (start <= end) {

      mid = start + (end - start) / 2;

      if (arr[mid] >= arr[0])
        start = mid + 1;
      else
        end = mid - 1;

    }



    return end;
  }
}