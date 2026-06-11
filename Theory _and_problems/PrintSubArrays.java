public class PrintSubArrays {
    public static void PrintSubArrays(int num[]){
        int totalSubArrays = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum =Integer.MAX_VALUE;

        for(int i =0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                int sum =0;
                
                for(int k =i;k<=j;k++){
                    System.out.print(num[k]+" ");
                    sum+=num[k];
                }
                System.out.print("sum="+sum+" ");
                minSum = Math.min(sum,minSum);
                maxSum = Math.max(sum,maxSum);
                totalSubArrays++;
                System.out.print("  ");
            }
            System.out.println();
        }
        System.err.println(totalSubArrays);
        System.out.println("minsum ="+minSum);
        System.out.println("maxSum ="+maxSum);
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        PrintSubArrays(num);
    }
    
}
