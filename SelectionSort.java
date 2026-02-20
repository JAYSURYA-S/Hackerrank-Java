public class SelectionSort{
    public static void main(String[] args){
        int arr[]={3,6,4,3,2,1,8};
        int i,j,len=arr.length,min,temp;
        for(i=0;i<len;i++)
        {
            min=i;
            for( j=i+1;j<len;j++)
            {
                if(arr[j]<arr[min])
                min=j;
            }
         temp= arr[i];
         arr[i]=arr[min];
         arr[min]=temp;
            
            
        }
        for(int X:arr)
        System.out.print(X+" ");
    }
}
