class Solution {
    public int removeElement(int[] nums, int val) {
        int p1 = 0;
        int n = nums.length;

        while (p1 < n){
            if (nums[p1] == val){
                nums[p1] = nums[n-1];
                n--;
            }
            else
                p1++;
        }

        return p1;
    }
}