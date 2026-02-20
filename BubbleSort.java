public class BubbleSort{
    public static void main(String[] args){
        int arr[]={3,2,5,4,1};
        int i,j,len=arr.length,temp;
        for(i=0;i<len;i++)
        {
            for(j=i+1;j<len;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int X:arr)
        System.out.print(X+" ");
    }
}
