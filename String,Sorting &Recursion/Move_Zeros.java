class Move_Zeros {
    public static void moveZeroes(int[] nums) {

        int left = 0;
        int right = 1;
        while (right < nums.length) {
            if (nums[left] == 0) {
                if (nums[right] != 0) {
                    nums[left] = nums[right];
                    nums[right] = 0;
                    right++;
                } else {
                    right++;
                }
                left++;
            } else {
                left++;
                right++;
            }
        }
        for (int i : nums) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 0, 3, 12 };
        moveZeroes(arr);
    }
}