public class IntersectionArray {

    public static void main(String args[])
    {

          int arr1[]={1,2,3,4,5};
          int arr2[]={2,3,4,5,6,7};
          int IntersectionArray[]=new int[arr1.length];

          int visited[]=new int[arr2.length];
          int l=0;
          for(int i=0;i<arr1.length;i++)
          {
            for(int k=0;k<arr2.length;k++)
            {

                if(arr1[i]==arr2[k] && visited[k]==0)
                {
                    IntersectionArray[l]=arr1[i];
                    visited[k]=1;
                    l++;
                    break;
                }

            }
          }

     for(int n=0;n<l;n++)
      {
        System.out.println(IntersectionArray[n]);
        
      }

    
    }
    
}
