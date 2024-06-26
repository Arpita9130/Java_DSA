package Java_DSA;

class RevereArray{
    public static void reverseArrays(int[] arr){
        
        for(int i=(arr.length)-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] originalArr = { 1, 2, 3, 4, 5 };
        reverseArrays(originalArr);
    }
}