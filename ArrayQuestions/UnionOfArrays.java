public class UnionOfArrays {
    public static Boolean existCheck(int arr[], int Element)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==Element)
                return true;

            }
            return false;
        }

    public static void main(String args[])
    {
        int arr1[]={1,2,3,4,5};
        int arr2[]={2,4,5,6,7};

       

        int n1=arr1.length;
        int n2=arr2.length;

        int UnionOfArrays[]=new int[n1+n2];

        int i=0;
        int j=0;
        int k=0;

        while ( i<n1 && j<n2) {

         if(arr1[i]< arr2[j])
         {

            if(!existCheck(UnionOfArrays, arr1[i]))
            {
                UnionOfArrays[k]=arr1[i];
               
                k++;
            }
            i++;


         }else
         {
             if(!existCheck(UnionOfArrays, arr2[j]))
            {
                UnionOfArrays[k]=arr2[j];
               
                k++;
            }
            j++;
         }

        
            
        }

        while(i<n1){
             if(  !existCheck(UnionOfArrays, arr1[i]))
            {
                UnionOfArrays[k]=arr1[i];
               
                k++;
            }
            i++;

        }
        while (j<n2) {
              if(!existCheck(UnionOfArrays, arr2[j]))
            {
                UnionOfArrays[k]=arr2[j];
               
                k++;
            }
            j++;
            
        }
    for(int l=0;l<k;l++)
    {
        System.out.println(UnionOfArrays[l]);
        
    }

    }
    
  
}
