import java.util.Scanner;

public class quickSort {
    static void swap(int[] nums,int i,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    static int partition(int[] nums,int st,int end){
        int pivot = nums[st];
        int count = 0;
        for(int i=st+1;i<=end;i++){
            if(nums[i]<pivot){
                count++;
            }
        }
        int pivotidx = st + count;
        swap(nums,st,pivotidx);
        int i=st,j=end;
        while(i<pivotidx && j>pivotidx){
            while(nums[i]<=pivot){
                i++;
            }
            while(nums[j]>pivot){
                j--;
            }
            if(i<pivotidx && j>pivotidx){
                swap(nums,i,j);
                i++;
                j--;
            }
        }
        return pivotidx;
        
    }
    static void Quick_Sort(int[] nums,int st,int end){
        if(st>=end) return;
        int pi = partition(nums,st,end);
        Quick_Sort(nums,st,pi-1);
        Quick_Sort(nums,pi+1,end);  
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
        Quick_Sort(nums,0,n-1);
         for(int i=0;i<nums.length;i++){
             System.out.print(nums[i]+" ");
        }
    }
}
