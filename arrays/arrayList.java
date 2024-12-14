import java.util.*;
public class arrayList {
    static void reverseList(ArrayList<Integer> list){
        int i=0,j=list.size() - 1;
        while(i<j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.print("original array : "+ list);
        // reverseList(list);
        Collections.reverse(list);
        System.out.print("reverse array : "+ list);
    }
}
