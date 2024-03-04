class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> hm=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
        if(hm.containsKey(nums[i])==true)
          {
          int temp=hm.get(nums[i]);
          hm.put(nums[i],temp+1);
          }
        else
          {
              hm.put(nums[i],1);
          }
        }
        for(int i=0;i<nums.length;i++)
        {  int temp=hm.get(nums[i]);
            if(temp>nums.length/2)
              return nums[i];
        }
        return -1;
        
    }
}