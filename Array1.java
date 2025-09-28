import java.util.*;
class Main{
    public static int largestAndSecondLargest(int[] arr){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }
            else if(num>secondLargest && num!=largest){
                secondLargest=num;
            }
        }
        return secondLargest;
    }
    
    
    
    
    
    public static void removeDuplicates(int[] arr){
        int index=1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                arr[index]=arr[i];
                index++;
            }
        }
        for(int i=0; i<index; i++){
            System.out.print(arr[i]+" ");
        }  
    }
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements: ");
        int[] arr=new int[8];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        if(arr.length<2){
            System.out.println("Array must have at least 2 elements");
        }
        int num=largestAndSecondLargest(arr);
        if(num==Integer.MIN_VALUE){
            System.out.println("Second largest not found");
        }else{
            System.out.println("Second largest element: "+num);
        }
        
        
        
        
        int[] arr1=new int[6];
        System.out.println("Enter array elements: ");
        for(int i=0; i<arr1.length; i++){
            arr1[i]=sc.nextInt();
        }
        removeDuplicates(arr1);
    }
}
