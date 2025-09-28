import java.util.*;
class Main{
    
    public static int linearSearch(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    
    
    
    public static int binarySearch(int[] arr, int key){
        int left=0, right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==key){
                return mid;
            }else if(key>arr[left]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[7];
        System.out.println("Enter array elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter key element: ");
        int key=sc.nextInt();
        int result=linearSearch(arr, key);
        if(result!=-1){
              System.out.println("Enter key element: "+result+"th position");
        }else{
            System.out.println("Element not found");
        }
        
        
        result=binarySearch(arr, key);
        if(result!=-1){
              System.out.println("Enter key element: "+result+"th position");
        }else{
            System.out.println("Element not found");
        }
        
        
    }
}
