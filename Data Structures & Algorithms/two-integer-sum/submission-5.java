class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], i);

        int remaining = 0;

        for (int i = 0; i < nums.length; i++){
            remaining = target - nums[i];
            if (map.containsKey(remaining) && map.get(remaining) != i)
                return new int[] {i, map.get(remaining)};
        }

        return new int[] {};
    }
}
