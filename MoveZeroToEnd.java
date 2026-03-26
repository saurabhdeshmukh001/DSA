public class MoveZeroToEnd {

    public static void main(String args[])
    {
        int arr[]={2,0,1,0};

        int j=arr.length-1;
        int i=0;
        while(i<=j)
        {
           if(arr[i]!=0)
           {
            i++;
           }
           else if(arr[j]==0)
           {
            j--;
           }
           else
           {
             int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
                 i++;
                 j--;
           }

        }

        for(int k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }
    }
    
}
