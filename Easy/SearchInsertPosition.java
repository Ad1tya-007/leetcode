package Easy;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int a = 0;
        int b = nums.length - 1;
        while (a <= b) {
            int index = a + ((b - a) / 2);
            if (nums[index] == target) {
                return index;
            } else if (nums[index] > target) {
                b = index - 1;
            } else if (nums[index] < target) {
                a = index + 1;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 4, 5, 7, 9 };
        System.out.println(searchInsert(nums, 2));
        System.out.println(searchInsert(nums, 3));
        System.out.println(searchInsert(nums, 7));
        System.out.println(searchInsert(nums, 9));
        System.out.println(searchInsert(nums, 10));
    }
}
