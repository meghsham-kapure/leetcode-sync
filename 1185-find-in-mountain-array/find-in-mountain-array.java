/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
  public int findInMountainArray(int target, MountainArray mountainArr) {
    int peak = findPeak(mountainArr);

    int result = binarySearch(target, mountainArr, true, peak);

    if (result == -1) {
      result = binarySearch(target, mountainArr, false, peak+1);
    }

    System.out.println("result => " + result);

    return result;
  }

  public int findPeak(MountainArray mountainArr) {
    int start = 0;
    int end = mountainArr.length()-1;

    while (start < end) {
      int mid = start + (end - start) / 2;

      if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
        start = mid + 1;
      }

      else {
        end = mid;
      }

    }

    return end;
  }

  public int binarySearch(int target, MountainArray mountainArr, boolean isAscending, int peak) {

    int start = isAscending ? 0 : peak;
    int end = isAscending ? peak : mountainArr.length()-1;

    while (start <= end) {

      int mid = start + (end - start) / 2;
    System.out.println("mid => " + mid);

      int midValue = mountainArr.get(mid);

      if (midValue == target) {
        return mid;
      }

      if (midValue < target) {

        if (isAscending) {
          start = mid + 1;
        }

        else {
          end = mid - 1;
        }

      }

      else {

        if (isAscending) {
          end = mid - 1;
        }

        else {
          start = mid + 1;
        }

      }

    }

    return -1;

  }
}