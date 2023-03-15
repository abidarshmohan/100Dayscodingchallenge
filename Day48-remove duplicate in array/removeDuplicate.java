public class removeDuplicate {
    public static void main(String[] args) {
      int [] arr  =new int[] {1,2,3,4,3,4,3,8};
      int len=arr.length;
      
      for(int i=0;i<len;i++)
      {
        System.out.println(arr[i]);
      }
     

      for(int i=0;i<len;i++)
      {
        for(int j=i+1;j<len;j++)
        {
            if(arr[i]==arr[j])
            {
                arr[i]=-1;
            }
        }
      }
      System.out.println("removed array is : ");
      for(int i=0;i<len;i++)
      {
        if(arr[i]!=-1)
        {
            System.out.println(arr[i]);
        }
      }

    }
}
