package com.program004;

class Application {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
//        int k = 3;
//        for (int i = 1; i <= k; i++) {
//            for (int j = nums.length - 1; j >= 0; j--) {
//                int temp = nums[j];
//                nums[j] = nums[nums.length - i - 1];
//                nums[nums.length - i - 1] = temp;
//            }
//            System.out.println(nums[i]);
//        }

        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }

//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] > nums[j]) {
//                    int temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
