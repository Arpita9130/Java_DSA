package Java_DSA;

import java.util.Arrays;

public class Choclate_Distribution_Problem {
    public static void ditribute(int[] nums,int m) {
        Arrays.sort(nums);
        int MIN_DIFF=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
        int nexti=i+m-1;
        if(nexti>=nums.length) 
            break;
        else{
            if(nums[nexti]>MIN_DIFF){
                continue;
            }
            else{
                MIN_DIFF=nums[nexti]-nums[i];
            }
        }
       }
       System.out.println("Minimum difference is : "+MIN_DIFF);
    }
    public static void main(String[] args) {
        ditribute( new int[] {7, 3, 2, 4, 9, 12, 56},3);
    }
}
