import java.util.*;
public class LinearSearch {
    public static int linearSearch(int arr[], int key){
        boolean found = false;
        int pos = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==key){
                pos = i;
                found = true;
                break;
            }
            
        }
        if(!found){
               pos = -1; 
            }
        return pos;
    }
    public static int linearSearch(String names[], String key){
        boolean found = false;
        int pos = 0;
        for(int i =0;i<names.length;i++){
            if(key.equals(names[i])){
                pos = i;
                found = true;
                break;
            }
        }
        if(!found){
            pos = -1;
        }
        return pos;
    }
    public static int largestNum(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element that needs to be found:");
        int key = sc.nextInt();
        System.out.println("Key is found at "+linearSearch(arr,key));
        System.out.println("The largest element in the array is "+largestNum(arr));
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        sc.nextLine();
        String names[] = new String[size];
        System.out.println("Enter the array elements");
        for(int i =0;i<size;i++){
            names[i] = sc.nextLine();
        }
        System.out.println("Enter the element that needs to be found:");
        String keys = sc.nextLine();
        System.out.println("Key is found at "+linearSearch(names,keys));
        
    }
}
