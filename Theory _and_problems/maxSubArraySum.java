public class maxSubArraySum {
    public static void maxSubArraySumbruteforce(int num[]){
        //int totalSubArrays = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum =Integer.MAX_VALUE;

        for(int i =0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                int sum =0;
                
                for(int k =i;k<=j;k++){
                    //System.out.print(num[k]+" ");
                    sum+=num[k];
                }
                //System.out.print("sum="+sum+" ");
                minSum = Math.min(sum,minSum);
                maxSum = Math.max(sum,maxSum);
                //totalSubArrays++;
                System.out.print("  ");
            }
            //System.out.println();
        }
        
        //System.err.println(totalSubArrays);
        System.out.println("minsum ="+minSum);
        System.out.println("maxSum ="+maxSum);
    }
    public static void maxSubArraySumPrefixSumArray(int num[]){
        int maxSum = Integer.MIN_VALUE;
        int minSum =Integer.MAX_VALUE;
        int prefixSumArray[] = new int[num.length];
        prefixSumArray[0] = num[0];
        for(int i=1;i<num.length;i++){
            prefixSumArray[i] = prefixSumArray[i-1]+num[i];
        }
        for(int i =0;i<num.length;i++){// i is start
            for(int j=i;j<num.length;j++){// j is end 
                int sum = i==0? prefixSumArray[j]:prefixSumArray[j] - prefixSumArray[i-1];//  prefix[end] - prefix[start-1]
                maxSum = Math.max(sum, maxSum);
                minSum = Math.min(sum, minSum);   
            } 
            //System.out.println();
        }
        
        //System.err.println(totalSubArrays);
        System.out.println("minsum ="+minSum);
        System.out.println("maxSum ="+maxSum);
    }
    public static void maxSubArraySumKadanes(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0;i<num.length;i++){
            currSum+=num[i];
            if(currSum<0){
                currSum =0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println("MaxSubArraySum ="+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        maxSubArraySumbruteforce(arr);
        maxSubArraySumPrefixSumArray(arr);
        maxSubArraySumKadanes(arr);
    }

    
}
