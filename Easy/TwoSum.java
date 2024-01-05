
package Easy;
/* 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/

public class TwoSum {
     public static int[] twoSum(int[] nums, int target) {
          int[] array = new int[2];
          for (int i = 0; i < nums.length; i++) {
               for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                         array[0] = i;
                         array[1] = j;
                         return array;
                    }
               }
          }
          return array;
     }

     public static void main(String[] args) {
          int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
          System.out.println(twoSum(array, 1));
          System.out.println(twoSum(array, 2));
          System.out.println(twoSum(array, 3));
          System.out.println(twoSum(array, 4));
          System.out.println(twoSum(array, 5));
          System.out.println(twoSum(array, 6));
          System.out.println(twoSum(array, 7));
          System.out.println(twoSum(array, 8));
          System.out.println(twoSum(array, 9));
          System.out.println(twoSum(array, 10));
     }
}