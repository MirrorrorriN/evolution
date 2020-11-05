package com.mirror.evolution.applet.aDemo;

/**
 * Created by mirrordingjing @ 2020/8/28
 */
public class Demo {
    public int search(int[] nums,int k){
        int n=nums.length;
        if(n==0) return -1;
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid=low+(high-low);
            if(nums[mid]<k){
                if(mid<n-1&&nums[mid+1]>k){
                    return mid+1;
                }
                low=mid+1;
            }else if(nums[mid]>k){
                if(mid==0||nums[mid-1]<k){
                    return mid;
                }
                high=mid-1;
            }else{
                while(mid<n&&nums[mid]==k){
                    mid++;
                }
                return mid==n?-1:mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Demo demo=new Demo();
        int[] nums=new int[]{1,2,2,3,4,5,6,6,6,7};
        System.out.println(demo.search(nums,6));
    }
}
