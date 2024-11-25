package by.tatevik.week7;

import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            int[]nums={0,0,1,1,2,2,3,4,4};
            int[] expectedNums={0,1,2,3,4};
            int[] result= removeDuplicates(nums);
            System.out.println(Arrays.equals(result,expectedNums));
            System.out.println(Arrays.toString(result));
        }

        public static int[] removeDuplicates(int[] nums) {
            Arrays.sort(nums);
            int k = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i == 0 || nums[i] != nums[i - 1]) {
                    nums[k++] = nums[i];
                }
            }
            return Arrays.copyOf(nums, k);
        }
    }

