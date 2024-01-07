package Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferenceOfTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> ans1 = new ArrayList<Integer>();
        List<Integer> ans2 = new ArrayList<Integer>();
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        for (int n : nums1)
            set1.add(n);
        for (int n : nums2)
            set2.add(n);
        for (int n : set1) {
            if (set2.contains(n) == false) {
                ans1.add(n);
            }
        }
        for (int n : set2) {
            if (set1.contains(n) == false) {
                ans2.add(n);
            }
        }
        ans.add(ans1);
        ans.add(ans2);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = { 48, -111, 73, 26, 382, -97, -129, 91, 110, 373, -360, -236, 194, 282, -229, 352, 25, 213, -15,
                193, 365, 187, 277, -20 };
        int[] arr2 = { -371, 41, 261, -294, -247, -63, -47, 384, 425, 58, 484, 393, 236, -265, -198, -415, -366, 284,
                136, -470, 433, 390, -160, -410, -317, -252, -41, -423, 177, 350, -92, 448, -125, -229, 35, 110, 443,
                -73, 32 };
        List<List<Integer>> ans = findDifference(arr1, arr2);
        System.out.println(ans.get(0));
        System.out.println(ans.get(1));
    }
}
