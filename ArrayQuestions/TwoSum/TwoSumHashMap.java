package TwoSum;

import java.util.HashMap;

public class TwoSumHashMap {

    boolean twoSum(int target, int arr[]) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0; i<arr.length;i++)
        {
            int rem=target=arr[i];
            if(map.containsValue(rem))
            {
                return true;
            }
            else{
                map.put(i, arr[i]);
            }
        }
        return false;

    }

    public static void main(String[] args) {

        TwoSumBrute twoSumBrute = new TwoSumBrute();
        int target = 10;
        int arr[] = { 1, 2, 3, 5, 6, };

        Boolean result = twoSumBrute.twoSum(target, arr);

        if (result == true) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

    }

}