public class two_sum {
    public static int[] twoSum(int nums[],int target) {
        int n=nums.length;
        for (int i = 0; i < n-1; i++){
            for (int j = i+1; j < n; j++) {
                if (nums[i]+nums[j]==target) {
                    return new int[]{i,j};
                }
            }
        } 
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int twoSum[]={2,7,5,55,3,8};

    }
    
}


