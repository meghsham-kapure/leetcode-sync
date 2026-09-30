class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int required = target - arr[i];

            if (map.get(required) != null)
                return new int[] { i, map.get(required) };
            else
                map.put(arr[i], i);
        }

        return new int[] { -1, -1 };

    }
}