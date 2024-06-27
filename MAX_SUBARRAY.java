package Java_DSA;
public class MAX_SUBARRAY {
    public static int maxSubArray(int[] nums) {
        int curr_sum=0,max_sum=Integer.MIN_VALUE,s=0,e=0,start;
        int size=nums.length;
        for(int i=0;i<size;i++){
            curr_sum+=nums[i];
            if(curr_sum>max_sum)
             {
                max_sum=curr_sum;
                start=s;
                e=i;
             }
             if(curr_sum<0){
                curr_sum=0;
                s=i+1;
             }
        }
       return max_sum;
    }

    public static void main(String[] args) {
        int[] nums ={-2,1,-3,4,-1,2,1,-5,4};
       System.out.println(maxSubArray(nums));
    }
}