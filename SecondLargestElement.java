public class SecondLargestElement {
    
    public static void  main(String[] args)
    {
        int arr[]={1,2,3,4,5};

         int Largest=0;
         int SecondLargest=0;

         for(int i=0;i<arr.length;i++)
         {
            if(arr[i]>Largest)
            {
                SecondLargest=Largest;
                Largest=arr[i];
            }else if(arr[i]<Largest && arr[i]>SecondLargest)
            {
                SecondLargest=arr[i];
            }
        
         }

         System.out.println("Second Largest Element:"+SecondLargest);
    }
    
}
