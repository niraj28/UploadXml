package scs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
    List<List<Integer>> subset = new ArrayList<>(); 
        boolean[] used = new boolean[nums.length];
        dfs(subset,0,nums,new ArrayList(),used);
        return subset;
    }
    static void dfs(List<List<Integer>> subset, int index, int[] nums, List<Integer> current,boolean[] used){
        if(current.size()==3){
         int k=0;
            for(Integer p: current){
                k=k+p;
            }
            if(k==0){
            subset.add(new ArrayList(current));
            }
           
        }
        
        for(int i=index;i<nums.length;i++){
             if(i > index && nums[i]==nums[i-1])continue;
            current.add(nums[i]);
            used[i]=true;
            dfs(subset, i+1,nums,current,used);
            current.remove(current.size()-1);
            used[i]=false;
        } 
    }
 
    public static void main(String[] args) {
    	int[] nums= new int[]{-1,0,1,2,-1,-4};
    	System.out.println(threeSum(nums));
    }
    
  /*  class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> subset=new ArrayList<>();
         
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                           List<Integer> integerList = new ArrayList<>();
                      integerList.add(nums[i]); 
                        integerList.add(nums[j]);
                        integerList.add(nums[k]);
                        subset.add(integerList);
                    }
                }
            }
        }
            return subset;
        }
    }*/
}
