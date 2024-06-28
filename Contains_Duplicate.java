package Java_DSA;

public class Contains_Duplicate {
    public boolean duplicate(int[] nums){
        int s=nums.length;
        for(int i=0;i<s;i++){
            for(int j=i+1;j<s;j++){
                if(nums[i]==nums[j])
                return true;
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        Contains_Duplicate d=new Contains_Duplicate();
        System.out.println(d.duplicate(new int[] {1,2,3,1}));
        System.out.println(d.duplicate(new int[] {1,2,3,4}));
        
    }
}
