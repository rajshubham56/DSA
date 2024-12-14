class demoArrays{
    void sumOfArrays(){
        int[] arr = {3,4,5,5,4};
        int sum = 0;
        for(int i=0; i<5; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

public class basic {
    public static void main(String[] args) {
        demoArrays obj = new demoArrays();
        obj.sumOfArrays();
    }
}
