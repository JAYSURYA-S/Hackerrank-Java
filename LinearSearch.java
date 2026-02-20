public class LinearSearch{
    public static void main(String[] args){
        int arr[]={5,4,3,2,1};
        int k=10;
        int i, len=arr.length,index=-1;
        boolean flag=false;
        for( i=0;i<len;i++)
        {
            if(arr[i]==k)
            flag=true;
            index=i;
            break;
        }
        if(flag)
        System.out.print("Element found "+ index);
        else
        System.out.print("Element not found");
        
        
        
    }
}
