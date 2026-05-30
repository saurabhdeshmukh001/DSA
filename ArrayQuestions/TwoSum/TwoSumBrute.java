package TwoSum;

public class TwoSumBrute {

    boolean twoSum(int target, int arr[])
    { 

        for(int i=0;i<arr.length;i++)
        {
            int rem=target-arr[i];
            for (int j=0;j<arr.length;j++)
            {

                if(i!=j && rem==arr[j])
                {
                    return true;
                }
                
            }

        }
        return false;
      
    }

public static void main(String args[])
{
   
    TwoSumBrute twoSumBrute= new TwoSumBrute();
    int target=10;
    int arr[]={1,2,3,5,6,};

     Boolean result=twoSumBrute.twoSum(target, arr);
     
     if(result==true)
     {
        System.out.println("Found");
     }
     else
     {
        System.out.println("Not Found");
     }


}
    
    
}
