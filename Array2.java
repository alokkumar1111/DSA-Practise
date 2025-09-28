import java.util.*;
class Main{
    public static int[] rotateLeft(int[] arr){
        int temp=arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        return arr;
    }
    
    
    public static int[] rotateRight(int[] arr){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        return arr;
    }
    
    
    public static int[] reverseArray(int[] arr){
        int start=0, end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    
    
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[7];
        System.out.println("Enter array elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
    
       
       
    //   rotateLeft(arr);
    //   System.out.println();
    //   System.out.println("Left-Rotated elements array: ");
    //   for(int i=0; i<arr.length; i++){
    //       System.out.print(arr[i]+" ");
    //   }
       
       
    //   rotateRight(arr);
    //   System.out.println();
    //   System.out.println("Right-Rotated elements array: ");
    //   for(int i=0; i<arr.length; i++){
    //       System.out.print(arr[i]+" ");
    //   }
       
    
       reverseArray(arr);
       System.out.println();
       System.out.println("Reversed array: ");
       for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
       }
    }
}
