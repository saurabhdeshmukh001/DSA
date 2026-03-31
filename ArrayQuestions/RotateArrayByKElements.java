public class RotateArrayByKElements {

    int[] rotate(String str, int k,int arr[])
    {
       if(str.equals(str))
       {

        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        start=0;
        end =k-1;
         while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        start=k;
        end =arr.length-1;
         while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        


       }else{
          int start=0;
          int end =k;
         while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

         start=k+1;
        end =arr.length-1;
         while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
          start=0;
         end=arr.length-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

       }

       return arr;
    }



    public static void main(String args[])
    {

     int arr[]={1,2,3,4,5,6};

     RotateArrayByKElements r1=new RotateArrayByKElements();

      int result1[]= r1.rotate("Right", 2,arr);

      for(int i=0;i<result1.length;i++)
      {
        System.out.println(result1[i]);
      }
    
       int result2[]= r1.rotate("Left", 2,arr);

      for(int i=0;i<result2.length;i++)
      {
        System.out.println(result2[i]);
      }

    }
}
