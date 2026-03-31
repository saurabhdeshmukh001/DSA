public class OnceAppearance
{
    public static void main(String args[])
    {
        int arr[]={1,1,2,2,3,3,4};

        int max=arr[1];

        for(int i=0; i< arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                 max =arr[i+1];
            }
            
        }

       int hash[]=new int[max+1];
       for(int i=0;i<arr.length;i++)
       {
   
        hash[arr[i]]++;
        
       }

       for(int i=0; i<arr.length;i++)
       {
        if(hash[arr[i]]==1)
        {
            System.out.println("Element appeared once:"+ arr[i]);
            break;
        }
       }
    }
}