import java.util.Vector;


public class IntersectionOfArrayOptimal {

    public static void main(String args[])
        {

            int arr1[]={1,2,2,3,3,4,5,6};
            int arr2[]={2,3,3,5,6,6,7};

           Vector<Integer> v=new Vector<>();

           int n=arr1.length;
           int m= arr2.length;

           int i=0;
           int j=0;

           while(i<n && i< m)
           {
            if(arr1[i]<arr2[j])
            {
                i++;

            }
            else if(arr2[j]<arr1[i])
            {
                j++;
            }
            else
            {
                v.add(arr1[i]);
                i++;
                j++;
            }

           }


           for( Integer num:v)
           {
            System.out.println(num);
           }



        }
    
    
}
