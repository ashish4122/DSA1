class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       int[] arr = new int[Math.min(nums1.length, nums2.length)];
        int j=0;
        HashSet<Integer>hm=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(hm.contains(nums1[i]))
            continue;
            else
            hm.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++)
        {
            if(hm.contains(nums2[i]))
            {
                arr[j++]=nums2[i];
                hm.remove(nums2[i]);
            }
    
        }
        return Arrays.copyOf(arr, j);   // to cut the size of array to required size so the zeros containing unassigned places dont count in our answer 
    }
}
