public class TrappingRainWater {
    
    public static int trappingWater(int height[]){
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i =1;i<height.length;i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        for(int i = height.length-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }
        int vol = 0;
        for(int i =0;i<height.length;i++){
            int waterlevel = Math.min(leftMax[i],rightMax[i]);
            vol+= waterlevel-height[i];
        }
        return vol;
    }

    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappingWater(height));
    }
    
}
