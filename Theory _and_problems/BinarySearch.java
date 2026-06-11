public class BinarySearch {
    public static int binarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        //int pos =0;
        //boolean found = false;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        int nums [] = {2,4,5,68,89,90};
        int key = 9;
        System.out.println("Key "+key+" is found at "+binarySearch(nums, key));

        

    }
    
}
