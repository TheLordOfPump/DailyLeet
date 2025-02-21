package y2025;

public class d20 {
    public static void main(String[] args) {
    }
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // Pointer for the position of the next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Found a new unique element
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
