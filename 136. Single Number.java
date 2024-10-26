class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int i : nums){
          /// XOR the result variable across the whole array. pairs will cancel eaach other 
            result = i ^ result;
        }

        return result;
    }
}

// T(C): O(n)
// S(C) : O(1)
