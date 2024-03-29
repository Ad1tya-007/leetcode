package Easy;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] array = { 3, 2, 2, 3 };
        int k = removeElement(array, 3);
        assert k == 2;
        System.out.println(k);
    }
}
