import java.util.Scanner;

public class mergeSort {
    static void merge(int[] nums,int st,int mid,int end){
        int n1 = mid-st+1;
        int n2 = end-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=nums[st+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=nums[mid+1+j];
        }
        int i=0,j=0,k=st;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                nums[k++]=left[i++];
            }
            else{
                nums[k++]=right[j++];
            }
        }
        while(i<n1) nums[k++]=left[i++];
        while(j<n2) nums[k++]=right[j++];
    }
    static void merge_Sort(int[] nums,int st,int end){
        if(st<end){
            int mid = st + (end - st) / 2;
            merge_Sort(nums,st,mid);
            merge_Sort(nums,mid+1,end);
            merge(nums,st,mid,end);
        }      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n :");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("enter all element : ");
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        merge_Sort(nums,0,n-1);
         for(int i=0;i<nums.length;i++){
             System.out.print(nums[i]+" ");
        }
    }
}
