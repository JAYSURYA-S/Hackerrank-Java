public class BinarySearch{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int target=3;
        int start=0,end=arr.length-1,mid;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(arr[mid]==target){
            System.out.println(mid);
            return;
            }
             else if(arr[mid]<target)
        start=mid+1;
        else if(arr[mid]>target)
        end=mid-1;
            
        }
        System.out.println(-1);
       
    
        
        
    }
}
